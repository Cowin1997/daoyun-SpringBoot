package fzu.edu.cn.controller;

import fzu.edu.cn.entity.Major;
import fzu.edu.cn.mapper.MajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/major"})
public class MajorController {
    @Autowired
    private MajorMapper majorMapper;

    @RequestMapping(value = {"/getMajors"},method = {RequestMethod.GET})
    @ResponseBody
    public List<Major> getAllMajorBySchoolCode(@RequestParam("schoolcode") String code){
        System.out.println(code);
        return this.majorMapper.getAllMajorBySchoolCode(code);
    }
}
