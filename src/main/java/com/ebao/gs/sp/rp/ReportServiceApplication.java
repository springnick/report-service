package com.ebao.gs.sp.rp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ReportServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportServiceApplication.class, args);
    }

    @Bean
    Function<String,String> upcase(){
        return value-> {
            System.out.println(String.format("upcase string :%s",value));
           return value.toUpperCase();
        };
    }


}
