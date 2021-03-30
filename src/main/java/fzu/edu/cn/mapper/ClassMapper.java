package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.ClasS;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassMapper {


    @Select("select * from class where majorcode=#{majorcode};")
    @Results({
            @Result(column = "cid", property = "cid"),
            @Result(column = "cname", property = "cname"),
            @Result(column = "site", property = "site"),
            @Result(column = "schoolcode", property = "schoolcode"),
            @Result(column = "majorcode", property = "majorcode"),
            @Result(column = "tid", property = "teacher",one = @One(
                    select = "fzu.edu.cn.mapper.TeacherMapper.getTeacherById"
            ))
    })
    public List<ClasS> getClassByMajorCode(String code);


}
