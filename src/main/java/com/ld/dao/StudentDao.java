package com.ld.dao;



import com.ld.entity.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentDao {
    public List<Student> queryAllStudents();
    public Integer addStudent(Student student);
    public List<Map<String,String>>getSpecial(@Param("strings")List<String> strings,Integer flag);
}
