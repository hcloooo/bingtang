package com.nacl.bingtang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.nacl.bingtang.mapper")
public class BingtangApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingtangApplication.class, args);
    }

}
