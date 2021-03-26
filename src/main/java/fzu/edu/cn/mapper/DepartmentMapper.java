package fzu.edu.cn.mapper;


import fzu.edu.cn.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface DepartmentMapper {
    @Select("select * from department where schoolId = #{id};")
    public List<Department> getDepartmentBySchoolId(Integer id);


}
