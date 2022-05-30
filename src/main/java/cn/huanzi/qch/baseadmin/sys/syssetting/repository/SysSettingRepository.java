package cn.huanzi.qch.baseadmin.sys.syssetting.repository;

import cn.huanzi.qch.baseadmin.combase.repository.*;
import cn.huanzi.qch.baseadmin.sys.syssetting.pojo.SysSetting;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingRepository extends CommonJpaRepository<SysSetting, String> {
}
