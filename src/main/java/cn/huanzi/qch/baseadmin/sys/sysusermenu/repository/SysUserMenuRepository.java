package cn.huanzi.qch.baseadmin.sys.sysusermenu.repository;

import cn.huanzi.qch.baseadmin.combase.repository.CommonJpaRepository;
import cn.huanzi.qch.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonJpaRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
