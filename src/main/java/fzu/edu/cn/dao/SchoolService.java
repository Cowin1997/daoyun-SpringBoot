package fzu.edu.cn.dao;


import fzu.edu.cn.entity.School;
import fzu.edu.cn.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;
    public List<School> getAllSchool(){
        return schoolMapper.getAllSchool();
    }
    public void addSchool(School school){ schoolMapper.addSchool(school);}
    public void delSchool(String code){ schoolMapper.delSchool(code);}
    public void editSchoolName(String newSchoolName, String code){ schoolMapper.editSchoolName(newSchoolName, code);}

}
