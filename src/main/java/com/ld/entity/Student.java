package com.ld.entity;

public class Student {
    Integer sco;
    String name;
    Integer age;
    Integer gender;
    Integer clazz;
    public Student(){
    }

    public Student(Integer sco, String name, Integer age, Integer gender, Integer clazz) {
        this.sco = sco;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clazz = clazz;
    }

    public Integer getSco() {
        return sco;
    }

    public void setSco(Integer sco) {
        this.sco = sco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getClazz() {
        return clazz;
    }

    public void setClazz(Integer clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sco=" + sco +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
