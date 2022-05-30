package cn.huanzi.qch.baseadmin.biz.demo;

import cn.huanzi.qch.baseadmin.common.util.RsaUtil;
import cn.huanzi.qch.baseadmin.common.util.SysSettingUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *  用于调试或测试验证一些特性
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("t1")
    public ModelAndView t1(){
        ModelAndView modelAndView = new ModelAndView("demo/t1");
        //系统信息
        modelAndView.addObject("sys", SysSettingUtil.getSysSetting());
        //后端公钥
        String publicKey = RsaUtil.getPublicKey();
        modelAndView.addObject("publicKey", publicKey);
        return modelAndView;
    }

}
