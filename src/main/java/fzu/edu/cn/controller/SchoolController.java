package fzu.edu.cn.controller;

import fzu.edu.cn.dao.SchoolService;
import fzu.edu.cn.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;


    @RequestMapping(value = "/getAllSchool")
    @ResponseBody
    public List<School> getAllSchool(){
        List<School> schools = this.schoolService.getAllSchool();
        return schools;
    }
}
