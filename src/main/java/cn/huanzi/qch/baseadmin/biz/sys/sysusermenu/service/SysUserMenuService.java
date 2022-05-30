package cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.common.combase.service.CommonService;
import cn.huanzi.qch.baseadmin.biz.sys.sysmenu.vo.SysMenuVo;
import cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.pojo.SysUserMenu;
import cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.vo.SysUserMenuVo;

import java.util.List;

public interface SysUserMenuService extends CommonService<SysUserMenuVo, SysUserMenu, String> {
    Result<List<SysMenuVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String menuIdList);
}
