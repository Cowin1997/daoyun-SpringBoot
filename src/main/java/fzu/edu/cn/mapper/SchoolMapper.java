package fzu.edu.cn.mapper;


import fzu.edu.cn.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SchoolMapper {

    public List<School> getAllSchool();
    public void addSchool(School school);
    public void delSchool(String code);
    public void editSchoolName(String newSchoolName,String code);
}
