package cn.huanzi.qch.baseadmin.sys.sysmenu.service;

import cn.huanzi.qch.baseadmin.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.combase.service.*;
import cn.huanzi.qch.baseadmin.sys.sysmenu.pojo.SysMenu;
import cn.huanzi.qch.baseadmin.sys.sysmenu.vo.SysMenuVo;

import java.util.List;

public interface SysMenuService extends CommonService<SysMenuVo, SysMenu, String> {
    Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo);
}
