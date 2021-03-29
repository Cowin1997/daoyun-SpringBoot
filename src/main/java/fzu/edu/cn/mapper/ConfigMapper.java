package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.Config;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ConfigMapper {

    @Select("select * from config where name = #{name};")
    public List<Config> getConfigByName(String name);
    @Select("select * from config;")
    public List<Config> getAllConfig();
}
