package fzu.edu.cn.demo;

import fzu.edu.cn.entity.Admin;
import fzu.edu.cn.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DaoyunApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private AdminMapper adminMapper;


}
