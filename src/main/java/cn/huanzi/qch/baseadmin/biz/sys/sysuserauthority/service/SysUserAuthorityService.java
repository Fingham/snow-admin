package cn.huanzi.qch.baseadmin.biz.sys.sysuserauthority.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.common.combase.service.CommonService;
import cn.huanzi.qch.baseadmin.biz.sys.sysuserauthority.pojo.SysUserAuthority;
import cn.huanzi.qch.baseadmin.biz.sys.sysuserauthority.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String authorityIdList);
}
