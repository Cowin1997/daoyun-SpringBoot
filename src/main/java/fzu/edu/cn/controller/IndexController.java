package fzu.edu.cn.controller;

import fzu.edu.cn.dao.MenuService;
import fzu.edu.cn.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
    @Autowired
    private MenuService menuService;
    @RequestMapping(value = "/getMenu")
    @ResponseBody
    public HashMap getItem() {
        HashMap map = new HashMap();
        List<Menu> items = this.menuService.getAllMenu();
        if (items != null) {
            map.put("status", "success");
            map.put("items", items);
            return map;
        } else {
            map.put("status", "fail");
            return map;
        }
    }


}
