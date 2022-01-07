package com.ld.entity;

public class Clazz {
    Integer clazz;
    String clazzName;

    public Integer getClazz() {
        return clazz;
    }

    public void setClazz(Integer clazz) {
        this.clazz = clazz;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazz=" + clazz +
                ", clazzName='" + clazzName + '\'' +
                '}';
    }
}
