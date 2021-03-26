package fzu.edu.cn.controller;

import fzu.edu.cn.dao.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping(value = {"/course"})
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ResponseBody
    @RequestMapping(value = {"/delStuBySid"})
    public HashMap delStuBySid(@RequestParam("sid") String sid){
       boolean res =  this.courseService.delCourseStudent(sid);
       System.out.println(res);
       HashMap<String,Object> map= new HashMap<>();
       map.put("success",res);
       return map;
    }
}
