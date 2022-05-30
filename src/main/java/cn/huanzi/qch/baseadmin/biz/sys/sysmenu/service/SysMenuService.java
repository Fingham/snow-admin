package cn.huanzi.qch.baseadmin.biz.sys.sysmenu.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.common.combase.service.*;
import cn.huanzi.qch.baseadmin.biz.sys.sysmenu.pojo.SysMenu;
import cn.huanzi.qch.baseadmin.biz.sys.sysmenu.vo.SysMenuVo;

import java.util.List;

public interface SysMenuService extends CommonService<SysMenuVo, SysMenu, String> {
    Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo);
}
