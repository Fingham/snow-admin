package cn.huanzi.qch.baseadmin.biz.sys.sysuser.repository;

import cn.huanzi.qch.baseadmin.common.combase.repository.*;
import cn.huanzi.qch.baseadmin.biz.sys.sysuser.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonJpaRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}
