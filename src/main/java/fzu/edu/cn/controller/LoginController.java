package fzu.edu.cn.controller;

import fzu.edu.cn.dao.AdminService;
import fzu.edu.cn.entity.Admin;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@RestController
//@CrossOrigin
public class LoginController {
    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object isLogined(@RequestBody Admin admin, HttpServletRequest request, HttpServletResponse response) throws JSONException {
        JSONObject object = new JSONObject();
        String username = admin.getAccount();
        String password = admin.getPassword();
        Admin ValidateAdmin = this.adminService.getAdminByUserName(username);
        if(ValidateAdmin!=null && ValidateAdmin.getPassword().equals(password)){
            object.put("status","true");
            HttpSession session = request.getSession(); // 如果不存在则产生一个session,
            session.setAttribute("user",ValidateAdmin);
            System.out.println(session.getId());
            return object.toString();
        } else{
            object.put("status","false");
            return object.toString();
        }


    }
}
