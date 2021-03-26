package fzu.edu.cn.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseSelectMapper {
    @Select("select sid from courseselect where cid = #{id};")
    public List<String> getStudentListByClassId(Integer id);

    @Delete("delete from courseselect where sid = #{sid};")
    public Boolean delCourseStudent(String sid);
}
