package fzu.edu.cn.dao;

import fzu.edu.cn.entity.Student;
import fzu.edu.cn.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getStudentBySid(String sid){
        return studentMapper.getStudentBySid(sid);
    }
    public List<Student> getStudentsByClassId(Integer cid){
        return this.studentMapper.getStudentsByClassId(cid);
    }
}
