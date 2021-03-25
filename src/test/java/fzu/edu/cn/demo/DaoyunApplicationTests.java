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
    @Test
    public void TestadminService(){
        System.out.println(this.adminMapper.getAdminByUserName("admin"));
    //    Admin a = new Admin(null,"admin123","123456","管理员","",new Date(),"",2,true);
     //   this.adminMapper.addAdmin(a);
     //   this.adminMapper.changePassword("admin123","admin123");
    }

}
