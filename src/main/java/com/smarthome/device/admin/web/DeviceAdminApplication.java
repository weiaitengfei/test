package com.smarthome.device.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created with IntelliJ IDEA.
 * User: 智能家居小组
 * Date: 2019/10/29 下午 04:22
 */

@SpringBootApplication
@MapperScan(basePackages = "com.smarthome.device.admin.dao.mapper")
public class DeviceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeviceAdminApplication.class, args);
    }
}