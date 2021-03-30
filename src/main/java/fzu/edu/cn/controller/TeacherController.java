package fzu.edu.cn.controller;

import fzu.edu.cn.dao.TeacherService;
import fzu.edu.cn.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/teacher"})
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = {"/getAllTeacher"})
    @ResponseBody
    public List<Teacher> getAllTeacher(){
        return this.teacherService.getAllTeacher();
    }

    @RequestMapping(value = {"/getTeacherByName"})
    @ResponseBody
    public List<Teacher> getTeacherByName(@RequestParam("name")String name){
        return this.teacherService.getTeacherByName(name);
    }


    @RequestMapping(value = {"/getTeacherById"})
    @ResponseBody
    public List<Teacher> getTeacherById(@RequestParam("id")String id){
        return this.teacherService.getTeacherById(id);
    }
    @RequestMapping(value = {"/getTeacherByIdAndName"})
    @ResponseBody
    public List<Teacher> getTeacherByIdAndName(@RequestParam("name")String name,@RequestParam("id")String id){
        return this.teacherService.getTeacherByIdAndName(name,id);
    }



}
