package fzu.edu.cn.controller;

import fzu.edu.cn.dao.ClassService;
import fzu.edu.cn.entity.ClasS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/class"})
public class ClassController {
    @Autowired
    private ClassService classService;
    @RequestMapping(value = {"/getClass"},method = {RequestMethod.GET})
    @ResponseBody
    public List<ClasS> getClass(@RequestParam("majorcode") String code){
        return this.classService.getClassByMajorCode(code);
    }
}
