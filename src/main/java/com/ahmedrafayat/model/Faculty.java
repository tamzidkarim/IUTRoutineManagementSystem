package com.ahmedrafayat.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Faculty", schema = "iutroutine", catalog = "")
public class Faculty implements Serializable {

    @Id
    @Column(name="faculty_name",nullable = false,length = 45)
    private String name;

    @Basic
    @Column(name="designation")
    private String designation;

    @Basic
    @Column(name="priority")
    private int priority;

    @Basic
    @Column(name="department_name")
    private String deptname;

    @Basic
    @Column(name="user_name")
    private String username;

    public Faculty(String name, String designation, int priority, String deptname, String username) {
        this.name = name;
        this.designation = designation;
        this.priority = priority;
        this.deptname = deptname;
        this.username = username;
    }

    public Faculty(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", priority=" + priority +
                ", deptname='" + deptname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
