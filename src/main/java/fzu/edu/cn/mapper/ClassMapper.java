package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.ClasS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassMapper {
    @Select("select * from class where majorcode=#{majorcode};")
    public List<ClasS> getClassByMajorCode(String code);

}
