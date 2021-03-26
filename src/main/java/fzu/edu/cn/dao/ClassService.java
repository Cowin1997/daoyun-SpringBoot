package fzu.edu.cn.dao;

import fzu.edu.cn.entity.ClasS;
import fzu.edu.cn.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassMapper classMapper;


    public List<ClasS> getClassByMajorCode(String code){
      return this.classMapper.getClassByMajorCode(code);
    }
}
