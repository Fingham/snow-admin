package cn.huanzi.qch.baseadmin.biz.sys.sysmenu.repository;

import cn.huanzi.qch.baseadmin.common.combase.repository.*;
import cn.huanzi.qch.baseadmin.biz.sys.sysmenu.pojo.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuRepository extends CommonJpaRepository<SysMenu, String> {
}
