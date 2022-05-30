package cn.huanzi.qch.baseadmin.sys.sysuser.repository;

import cn.huanzi.qch.baseadmin.combase.repository.*;
import cn.huanzi.qch.baseadmin.sys.sysuser.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonJpaRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}
