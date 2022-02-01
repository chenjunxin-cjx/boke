package com.cjx.pojo;

import java.sql.Date;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
    private String auther;
    private String about;
    private Date joinDate;
    private Date join_update_date;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Date birthday, String auther, String about, Date joinDate, Date join_update_date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.auther = auther;
        this.about = about;
        this.joinDate = joinDate;
        this.join_update_date = join_update_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getJoin_update_date() {
        return join_update_date;
    }

    public void setJoin_update_date(Date join_update_date) {
        this.join_update_date = join_update_date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", auther='" + auther + '\'' +
                ", about='" + about + '\'' +
                ", joinDate=" + joinDate +
                ", join_update_date=" + join_update_date +
                '}';
    }
}
