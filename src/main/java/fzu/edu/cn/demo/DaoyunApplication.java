package fzu.edu.cn.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="fzu.edu.cn.*")
@MapperScan("fzu.edu.cn.mapper")
public class DaoyunApplication  {


    public static void main(String[] args) {
        SpringApplication.run(DaoyunApplication.class, args);
    }


}
