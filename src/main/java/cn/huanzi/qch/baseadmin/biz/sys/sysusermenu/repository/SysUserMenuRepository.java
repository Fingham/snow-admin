package cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.repository;

import cn.huanzi.qch.baseadmin.common.combase.repository.CommonJpaRepository;
import cn.huanzi.qch.baseadmin.biz.sys.sysusermenu.pojo.SysUserMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonJpaRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
