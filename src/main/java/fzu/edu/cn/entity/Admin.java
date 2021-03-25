package fzu.edu.cn.entity;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;


public class Admin {
    private Integer id;
    private String account;
    private String password;
    private String roles;
    private String last_ip;
    private Date last_time;
    private String phone;


    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                ", last_ip='" + last_ip + '\'' +
                ", last_time=" + last_time +
                ", phone='" + phone + '\'' +
                ", login_count=" + login_count +
                ", level=" + level +
                ", status=" + status +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Admin(Integer id, String account, String password, String roles, String last_ip, Date last_time, String phone, Integer login_count, Integer level, boolean status) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.roles = roles;
        this.last_ip = last_ip;
        this.last_time = last_time;
        this.phone = phone;
        this.login_count = login_count;
        this.level = level;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }

    public Date getLast_time() {
        return last_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    public Integer getLogin_count() {
        return login_count;
    }

    public void setLogin_count(Integer login_count) {
        this.login_count = login_count;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private Integer login_count;
    private Integer level;
    private boolean status;


}
