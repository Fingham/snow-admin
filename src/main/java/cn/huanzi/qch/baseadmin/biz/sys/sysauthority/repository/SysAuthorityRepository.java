package cn.huanzi.qch.baseadmin.biz.sys.sysauthority.repository;

import cn.huanzi.qch.baseadmin.common.combase.repository.*;
import cn.huanzi.qch.baseadmin.biz.sys.sysauthority.pojo.SysAuthority;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAuthorityRepository extends CommonJpaRepository<SysAuthority, String> {
}
