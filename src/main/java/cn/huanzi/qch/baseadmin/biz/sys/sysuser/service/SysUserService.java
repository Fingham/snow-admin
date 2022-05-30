package cn.huanzi.qch.baseadmin.biz.sys.sysuser.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.common.combase.service.CommonService;
import cn.huanzi.qch.baseadmin.biz.sys.sysuser.pojo.SysUser;
import cn.huanzi.qch.baseadmin.biz.sys.sysuser.vo.SysUserVo;

public interface SysUserService extends CommonService<SysUserVo, SysUser, String> {
    Result<SysUserVo> findByLoginName(String username);
    Result<SysUserVo> resetPassword(String userId);
}
