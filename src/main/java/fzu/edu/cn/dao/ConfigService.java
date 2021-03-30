package fzu.edu.cn.dao;

import fzu.edu.cn.entity.Config;
import fzu.edu.cn.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigService {
    @Autowired
    private ConfigMapper configMapper;

    public List<Config> getConfigByName(String name){
        return this.configMapper.getConfigByName(name);
    }

    public List<Config> getAllConfig(){
        return this.configMapper.getAllConfig();
    }


}
