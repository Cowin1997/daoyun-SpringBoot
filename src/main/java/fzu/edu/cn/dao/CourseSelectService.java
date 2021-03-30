package fzu.edu.cn.dao;

import fzu.edu.cn.mapper.CourseSelectMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseSelectService {
    @Autowired
    private CourseSelectMapper courseSelectMapper;

    public Boolean delCourseStudent(String sid){
        return this.courseSelectMapper.delCourseStudent(sid);
    }
}
