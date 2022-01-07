package com.ld.entity;

public class Grade {
    Integer sco;
    Integer clazz;
    Integer grades;

    public Integer getSco() {
        return sco;
    }

    public void setSco(Integer sco) {
        this.sco = sco;
    }

    public Integer getClazz() {
        return clazz;
    }

    public void setClazz(Integer clazz) {
        this.clazz = clazz;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "sco=" + sco +
                ", clazz=" + clazz +
                ", grades=" + grades +
                '}';
    }
}
