package cn.huanzi.qch.baseadmin.sys.sysuserauthority.service;

import cn.huanzi.qch.baseadmin.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.combase.service.CommonService;
import cn.huanzi.qch.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;
import cn.huanzi.qch.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String authorityIdList);
}
