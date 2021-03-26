package fzu.edu.cn.dao;

import fzu.edu.cn.entity.Major;
import fzu.edu.cn.mapper.MajorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {
    @Autowired
    private MajorMapper majorMapper;


    public List<Major> getAllMajorBySchoolCode(String code){
        return this.majorMapper.getAllMajorBySchoolCode(code);
    }



}
