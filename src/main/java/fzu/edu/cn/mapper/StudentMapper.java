package fzu.edu.cn.mapper;

import fzu.edu.cn.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student where sid = #{sid};")
    public List<Student> getStudentBySid(String sid);

    @Select("SELECT S.sid,S.sname,S.phone,S.sex,S.schoolcode,S.clocktimes,S.clockscore,S.lastclocktime,S.lastclocksite " +
            "from student S,courseselect CS WHERE CS.sid=S.sid and CS.classid=#{cid}; ")
    public List<Student> getStudentsByClassId(Integer cid);
}
