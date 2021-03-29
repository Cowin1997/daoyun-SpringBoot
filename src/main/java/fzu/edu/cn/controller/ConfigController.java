package fzu.edu.cn.controller;

import fzu.edu.cn.dao.ConfigService;
import fzu.edu.cn.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = {"/config"})
public class ConfigController {
    @Autowired
    private ConfigService configService;

    @RequestMapping(value = {"/get"})
    @ResponseBody
    public List<Config> getConfigData(@RequestParam("name")String name){
        return this.configService.getConfigByName(name);
    }

    @RequestMapping(value = {"/getAll"})
    @ResponseBody
    public List<Object> getAllConfigData(){
        List<Object> res = new ArrayList<>();
        List<Config> list = this.configService.getAllConfig();
        HashMap<String,Object> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i).getName()) == null){
                List<String> s = new ArrayList<>();
                s.add(list.get(i).getValue());
                map.put(list.get(i).getName(),s);
            }else{ //存在
                List<String> s = (List<String>) map.get(list.get(i).getName());
                s.add(list.get(i).getValue());
                map.put(list.get(i).getName(),s);
            }
        }
        for (String key:map.keySet()) {
            HashMap m = new HashMap();
            m.put("value",map.get(key));
            m.put("key",key);
            res.add(m);
        }
        System.out.println(res);
        return res;

    }

}
