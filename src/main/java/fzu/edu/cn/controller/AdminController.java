package fzu.edu.cn.controller;

import fzu.edu.cn.dao.AdminService;
import fzu.edu.cn.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/getInfo")
    @ResponseBody
    public Admin getInfo(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session!=null){
            System.out.println("getAllAdmin..."+session.getId());
            Admin admin = (Admin) session.getAttribute("user");
            System.out.println(admin.toString());
            return admin;
        }
        else{
            return null;
        }

    }


    @RequestMapping(value = "/getAllAdmin")
    @ResponseBody
    public List<Admin> getAllAdmin(HttpServletRequest request){
        List<Admin> list = this.adminService.getAllAdmin();
        HttpSession session = request.getSession(false);
        if(session!=null){
            System.out.println("getAllAdmin..."+session.getId());
            Admin admin = (Admin) session.getAttribute("user");
            System.out.println(admin.toString());
        }
        return list;
    }
    @ResponseBody
    @RequestMapping(value = "/logout")
    public HashMap logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);

        HashMap map = new HashMap();
        if(session!=null){
            session.invalidate();

        }
        return map;
    }
}
