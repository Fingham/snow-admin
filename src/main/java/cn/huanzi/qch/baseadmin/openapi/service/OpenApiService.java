package cn.huanzi.qch.baseadmin.openapi.service;

import cn.huanzi.qch.baseadmin.combase.pojo.Result;

public interface OpenApiService {
    /**
     * open api test测试
     * @return 测试数据
     */
    Result<String> test();
}
