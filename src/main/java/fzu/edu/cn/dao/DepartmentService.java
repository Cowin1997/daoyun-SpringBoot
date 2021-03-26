package fzu.edu.cn.dao;


import fzu.edu.cn.entity.Department;
import fzu.edu.cn.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    public List<Department> getDepartmentBySchoolId(Integer id){
        List<Department> departments =  departmentMapper.getDepartmentBySchoolId(id);
        if(departments.size() >0 ) return departments;
        else return null;
    }
}
