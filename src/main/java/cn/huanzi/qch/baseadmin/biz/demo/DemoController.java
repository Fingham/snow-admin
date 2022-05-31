package cn.huanzi.qch.baseadmin.biz.demo;

import cn.huanzi.qch.baseadmin.common.util.RsaUtil;
import cn.huanzi.qch.baseadmin.common.util.SysSettingUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *  用于调试或测试验证一些特性
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/t1")
    public ModelAndView t1(){
        ModelAndView modelAndView = new ModelAndView("demo/t1");
        //系统信息
        modelAndView.addObject("sys", SysSettingUtil.getSysSetting());
        //后端公钥
        String publicKey = RsaUtil.getPublicKey();
        modelAndView.addObject("publicKey", publicKey);
        return modelAndView;
    }

    @GetMapping("/t2")
    public ModelAndView t2(){
        ModelAndView modelAndView = new ModelAndView("demo/t2");
        //系统信息
        modelAndView.addObject("sys", SysSettingUtil.getSysSetting());
        //后端公钥
        String publicKey = RsaUtil.getPublicKey();
        modelAndView.addObject("publicKey", publicKey);
        return modelAndView;
    }

    /**
     *  通过后面变量跳转到对应页面
     * @param htmlname
     * @return
     */
    @GetMapping("/{htmlname}")
    public ModelAndView tt33(@PathVariable("htmlname") String htmlname){
        ModelAndView modelAndView = new ModelAndView("demo/"+htmlname);
        //系统信息
        modelAndView.addObject("sys", SysSettingUtil.getSysSetting());
        //后端公钥
        String publicKey = RsaUtil.getPublicKey();
        modelAndView.addObject("publicKey", publicKey);
        return modelAndView;
    }

    // TODO 可以后面研究它，在哪里的配置过滤将其拦截了
//    @GetMapping("/tt/{htmlname}")
//    public ModelAndView tt(@PathVariable("htmlname") String htmlname){
//        ModelAndView modelAndView = new ModelAndView("demo/"+htmlname);
//        //系统信息
//        modelAndView.addObject("sys", SysSettingUtil.getSysSetting());
//        //后端公钥
//        String publicKey = RsaUtil.getPublicKey();
//        modelAndView.addObject("publicKey", publicKey);
//        return modelAndView;
//    }

}
