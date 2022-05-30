package cn.huanzi.qch.baseadmin.biz.sys.sysuserauthority.repository;

import cn.huanzi.qch.baseadmin.common.combase.repository.CommonJpaRepository;
import cn.huanzi.qch.baseadmin.biz.sys.sysuserauthority.pojo.SysUserAuthority;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserAuthorityRepository extends CommonJpaRepository<SysUserAuthority, String> {
    List<SysUserAuthority> findByUserId(String userId);
}
