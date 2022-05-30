package cn.huanzi.qch.baseadmin.biz.sys.syssetting.repository;

import cn.huanzi.qch.baseadmin.common.combase.repository.*;
import cn.huanzi.qch.baseadmin.biz.sys.syssetting.pojo.SysSetting;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingRepository extends CommonJpaRepository<SysSetting, String> {
}
