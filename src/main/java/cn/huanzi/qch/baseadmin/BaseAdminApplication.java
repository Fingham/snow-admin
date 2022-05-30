package cn.huanzi.qch.baseadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类，运行入口函数main，即可启动项目
 */
@EnableAsync
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
public class BaseAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseAdminApplication.class, args);
    }
}
