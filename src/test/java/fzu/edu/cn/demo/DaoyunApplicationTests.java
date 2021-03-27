package fzu.edu.cn.demo;

import fzu.edu.cn.entity.Admin;
import fzu.edu.cn.mapper.AdminMapper;
import fzu.edu.cn.utils.HttpClient4Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;

@SpringBootTest
class DaoyunApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private AdminMapper adminMapper;

    @Test
    void test1(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("param1",123);
        map.put("param2","pp2");
        HttpClient4Utils.Get("http://localhost:8888/school/getAllSchool",null);
    }


}
