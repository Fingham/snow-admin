package cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.controller;

import cn.huanzi.qch.baseadmin.common.annotation.Decrypt;
import cn.huanzi.qch.baseadmin.common.annotation.Encrypt;
import cn.huanzi.qch.baseadmin.common.combase.controller.CommonController;
import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.biz.sys.sysmenu.service.SysMenuService;
import cn.huanzi.qch.baseadmin.biz.sys.sysmenu.vo.SysMenuVo;
import cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.pojo.SysUserMenu;
import cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.service.SysUserMenuService;
import cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.vo.SysUserMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys/sysUserMenu/")
public class SysUserMenuController extends CommonController<SysUserMenuVo, SysUserMenu, String> {
    @Autowired
    private SysUserMenuService sysUserMenuService;

    @Autowired
    private SysMenuService sysMenuService;

    @PostMapping("findUserMenuAndAllSysMenuByUserId")
    @Decrypt
    @Encrypt
    public Result<Map<String,Object>> findUserMenuAndAllSysMenuByUserId(SysUserMenuVo sysUserMenuVo){
        HashMap<String, Object> map = new HashMap<>(2);
        List<SysMenuVo> userSysMenuVoList = sysUserMenuService.findByUserId(sysUserMenuVo.getUserId()).getData();
        map.put("userSysMenuVoList",userSysMenuVoList);
        List<SysMenuVo> sysMenuVoList = sysMenuService.listByTier(new SysMenuVo()).getData();
        map.put("sysMenuVoList",sysMenuVoList);
        return Result.of(map);
    }

    @PostMapping("saveAllByUserId")
    @Decrypt
    @Encrypt
    public Result<Boolean> saveAllByUserId(SysUserMenuVo sysUserMenuVo){
        return sysUserMenuService.saveAllByUserId( sysUserMenuVo.getUserId(), sysUserMenuVo.getMenuIdList());
    }
}
