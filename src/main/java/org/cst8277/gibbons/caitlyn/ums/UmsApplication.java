package org.cst8277.gibbons.caitlyn.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class UmsApplication{

    public static void main(String[] args) {
        SpringApplication.run(UmsApplication.class, args);
    }

}
