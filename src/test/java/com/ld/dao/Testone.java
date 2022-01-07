package com.ld.dao;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageSerializable;
import com.ld.Entrance;
import com.ld.dao.StudentDao;
import com.ld.entity.Student;
import com.ld.entity.StudentDemo;
import com.ld.trans.StudentTrans;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Entrance.class)
public class Testone {
    @Autowired
    StudentDao studentDao;

    @Autowired
    DataSource dataSource;

    @Autowired
    StudentTrans studentTrans;

    @Test
    public void connect() {
        Integer sco = 1705110018;
        for (int i = 0; i < 100; i++) {
            String name = "刘德" + new Integer(i + 2).toString();
            Student ld = new Student(sco + i, name, i, 1, 1004);
            Integer integer = studentDao.addStudent(ld);
        }
    }

    @Test
    public void func2() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("sco");
        strings.add("age");
        List<Map<String, String>> special = studentDao.getSpecial(strings, 1);
        System.out.println(special);

    }

    @Test
    public void testDataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void func3() {
        List<Student> students = studentDao.queryAllStudents();
        System.out.println(students);
    }

    @Test
    public void testPageHelper() {
        //total=102 list=10
        PageSerializable<Object> objectPageSerializable = PageHelper.startPage(1, 10).doSelectPageSerializable(() -> studentDao.queryAllStudents());
        //直接返回Student数组
        Page<Student> objects = PageHelper.startPage(1, 10).doSelectPage(() -> studentDao.queryAllStudents());
    }

    @Test
    public void testMapStruct() {
        Page<Student> students = PageHelper.startPage(2, 10).doSelectPage(() ->
                studentDao.queryAllStudents()
        );
        ArrayList<StudentDemo> studentDemos = new ArrayList<>();
        for (Student student : students) {
            studentDemos.add(studentTrans.toDto(student));
        }
        System.out.println("-------");
        System.out.println(studentDemos);
    }


}
