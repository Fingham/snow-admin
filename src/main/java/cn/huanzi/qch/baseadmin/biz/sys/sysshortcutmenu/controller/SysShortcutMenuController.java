package cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.controller;

import cn.huanzi.qch.baseadmin.common.combase.controller.CommonController;
import cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.service.SysShortcutMenuService;
import cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.vo.SysShortcutMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
