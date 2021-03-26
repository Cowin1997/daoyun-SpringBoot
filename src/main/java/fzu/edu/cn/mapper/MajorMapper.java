package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MajorMapper {
    @Select("select * from major where schoolcode = #{code};")
    public List<Major> getAllMajorBySchoolCode(String code);
}
