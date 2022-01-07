package com.ld;

import com.ld.dao.StudentDao;
import com.ld.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

class MyList<E> extends ArrayList<E>{
    private String name;
    public MyList(String name){
        this.name = name;
    }
    public void setDate(List<E> dateList){
        this.clear();
        this.addAll(dateList);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "name='" + name + '\'' +
                '}'+super.toString();
    }
}
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Entrance.class)
public class testList {
    @Autowired
    StudentDao studentDao;
    @Test
    public void testList(){
        MyList<Student> students = new MyList<Student>("myList");
        List<Student> students1 = studentDao.queryAllStudents();
        students.setDate(students1);
        System.out.println(students);
    }

}
