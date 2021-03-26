package fzu.edu.cn.dao;

import fzu.edu.cn.entity.Menu;
import fzu.edu.cn.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> getAllMenu(){
        return this.menuMapper.getAllMenu();
    }
}
