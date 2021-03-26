package fzu.edu.cn.controller;

import fzu.edu.cn.dao.StudentService;
import fzu.edu.cn.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/student"})
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"/getStudentsByClassId"},method = {RequestMethod.GET})
    @ResponseBody
    public List<Student> getStudents(@RequestParam("classid") Integer classid){
        return this.studentService.getStudentsByClassId(classid);
    }
    @RequestMapping(value = {"/getStudentsByStudentId"},method = {RequestMethod.GET})
    @ResponseBody
    public List<Student> getStudentBySid(@RequestParam("sid") String sid){
        return this.studentService.getStudentBySid(sid);
    }



}
