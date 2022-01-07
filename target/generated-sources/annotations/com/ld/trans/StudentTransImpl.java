package com.ld.trans;

import com.ld.entity.Student;
import com.ld.entity.StudentDemo;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-07T14:52:40+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class StudentTransImpl implements StudentTrans {

    @Override
    public StudentDemo toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDemo studentDemo = new StudentDemo();

        studentDemo.setStudentName( student.getName() );
        studentDemo.setStudentAge( student.getAge() );
        studentDemo.setSco( student.getSco() );

        return studentDemo;
    }
}
