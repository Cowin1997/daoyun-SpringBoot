package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

    @Select("select * from teacher;")
    public List<Teacher> getAllTeacher();


    @Select("select * from teacher where tname like '%${name}%';")
    public List<Teacher> getTeacherByName(String name);

    @Select("select * from teacher where tid = #{id};")
    public List<Teacher> getTeacherById(String id);


    @Select("select * from teacher where tid = #{id} and tname= #{name};")
    public List<Teacher> getTeacherByIdAndName(String name,String id);

}
