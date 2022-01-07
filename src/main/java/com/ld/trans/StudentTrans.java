package com.ld.trans;

import com.ld.entity.Student;
import com.ld.entity.StudentDemo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")//加了componentModel = "spring"后自动生成这个接口的实现类
public interface StudentTrans {
    StudentTrans INSTANCE = Mappers.getMapper(StudentTrans.class);

    @Mapping(source = "name",target = "studentName")
    @Mapping(source = "age",target = "studentAge")
    StudentDemo toDto(Student student);
}
