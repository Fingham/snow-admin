package cn.huanzi.qch.baseadmin.biz.user.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;
import cn.huanzi.qch.baseadmin.biz.sys.sysuser.vo.SysUserVo;

public interface UserService {
    Result<SysUserVo> updatePassword(String oldPassword, String newPassword);

    Result<SysUserVo> updateUser(SysUserVo sysUserVo);
}
