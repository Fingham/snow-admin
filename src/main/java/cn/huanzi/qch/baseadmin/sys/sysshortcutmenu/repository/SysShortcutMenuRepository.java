package cn.huanzi.qch.baseadmin.sys.sysshortcutmenu.repository;

import cn.huanzi.qch.baseadmin.combase.repository.CommonJpaRepository;
import cn.huanzi.qch.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysShortcutMenuRepository extends CommonJpaRepository<SysShortcutMenu, String> {
    List<SysShortcutMenu> findByUserId(String userId);
}
