package fzu.edu.cn.dao;

import fzu.edu.cn.entity.Teacher;
import fzu.edu.cn.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> getAllTeacher(){
        return this.teacherMapper.getAllTeacher();
    }

    public List<Teacher> getTeacherByName(String name){
        return this.teacherMapper.getTeacherByName(name);
    }

    public List<Teacher> getTeacherById(String id){
        return this.teacherMapper.getTeacherById(id);
    }
    public List<Teacher> getTeacherByIdAndName(String name,String id){
        return this.teacherMapper.getTeacherByIdAndName(name,id);
    }

}
