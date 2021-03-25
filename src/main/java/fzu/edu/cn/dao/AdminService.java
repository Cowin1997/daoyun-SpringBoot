package fzu.edu.cn.dao;

import fzu.edu.cn.entity.Admin;
import fzu.edu.cn.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin getAdminByUserName(String account){
        return adminMapper.getAdminByUserName(account);
    }
    public void addAdmin(Admin admin){
        adminMapper.addAdmin(admin);
    }
    public void changePassword(String account,String newPassword){
        adminMapper.changePassword(account,newPassword);
    }
    public List<Admin> getAllAdmin(){
        return adminMapper.getAllAdmin();
    }
}
