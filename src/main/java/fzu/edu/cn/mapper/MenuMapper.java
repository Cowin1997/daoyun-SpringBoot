package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {

    @Select("select * from menu;")
    public List<Menu> getAllMenu();
}
