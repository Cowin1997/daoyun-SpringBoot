package fzu.edu.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
    @RequestMapping(value = "/getitems")
    @ResponseBody
    public HashMap getItem(){
        HashMap map = new HashMap();
        map.put("status","success");
        List<Item> items = new ArrayList<>();
        items.add(new Item("iconfont icon-wode","index","系统首页"));
        items.add(new Item("iconfont icon-all","student","学生管理"));
        items.add(new Item("iconfont icon-Customermanagement-fill","admin","管理员管理"));
        items.add(new Item("iconfont icon-office-supplies","class","班级管理"));
        map.put("items",items);
        return map;
    }

    static class Item{
        private String icon;
        private String index;
        private String title;

        public Item(String icon, String index, String title) {
            this.icon = icon;
            this.index = index;
            this.title = title;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "icon='" + icon + '\'' +
                    ", index='" + index + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }
}
