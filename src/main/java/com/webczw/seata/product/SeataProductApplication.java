package com.webczw.seata.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SeataProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataProductApplication.class, args);
    }

}
