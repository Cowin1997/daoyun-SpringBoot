package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AdminMapper {
    public Admin getAdminByUserName(String account);
    public void addAdmin(Admin admin);
    public void changePassword(String account,String newPassword);
    public List<Admin> getAllAdmin();
}
