package cn.huanzi.qch.baseadmin.biz.openapi.service;

import cn.huanzi.qch.baseadmin.common.combase.pojo.Result;

public interface OpenApiService {
    /**
     * open api test测试
     * @return 测试数据
     */
    Result<String> test();
}
