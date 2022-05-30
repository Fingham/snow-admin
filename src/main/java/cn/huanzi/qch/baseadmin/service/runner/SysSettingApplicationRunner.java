package cn.huanzi.qch.baseadmin.service.runner;

import cn.huanzi.qch.baseadmin.service.limiter.RateLimiter;
import cn.huanzi.qch.baseadmin.biz.sys.syssetting.service.SysSettingService;
import cn.huanzi.qch.baseadmin.biz.sys.syssetting.vo.SysSettingVo;
import cn.huanzi.qch.baseadmin.common.util.SysSettingUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.net.InetAddress;


@Slf4j
@Component
public class SysSettingApplicationRunner implements ApplicationRunner {

    @Autowired
    private SysSettingService sysSettingService;

    @Autowired
    private RateLimiter rateLimiter;

    @Value("${server.servlet.context-path:}")
    private String contextPath;

    /**
     * 端口
     */
    @Value("${server.port}")
    private String port;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //系统启动时获取数据库数据，设置到公用静态集合sysSettingMap
        SysSettingVo sysSettingVo = sysSettingService.get("1").getData();
        SysSettingUtil.setSysSettingMap(sysSettingVo);

        //判断OpenAPI限流开关是否开启
        if("Y".equals(SysSettingUtil.getSysSetting().getSysOpenApiLimiterEncrypt())){
            //令牌桶限流启动！
            rateLimiter.star();
        }

        //获取本机内网IP
        log.info("启动成功：{}","http://" + InetAddress.getLocalHost().getHostAddress() + ":" + port + contextPath);
    }
}
