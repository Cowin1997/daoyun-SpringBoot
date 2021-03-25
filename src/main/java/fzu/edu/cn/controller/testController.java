package fzu.edu.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/test")
public class testController {
    @RequestMapping(value = "/cookies", method = RequestMethod.GET)
    public void test01(HttpServletRequest request, HttpServletResponse response){
        request.getSession().setAttribute("1","123");

        return;
    }
}
