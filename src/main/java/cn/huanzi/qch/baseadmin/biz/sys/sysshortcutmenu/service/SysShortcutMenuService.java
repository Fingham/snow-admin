package cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.common.combase.service.CommonService;
import cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.huanzi.qch.baseadmin.biz.sys.sysshortcutmenu.vo.SysShortcutMenuVo;

import java.util.List;

public interface SysShortcutMenuService extends CommonService<SysShortcutMenuVo, SysShortcutMenu, String> {
    Result<List<SysShortcutMenuVo>> findByUserId(String userId);
}
