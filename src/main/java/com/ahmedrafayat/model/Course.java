package com.ahmedrafayat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Course", schema = "iutroutine", catalog = "")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="course_id",unique = true,nullable = false)
    private int id;

    @Basic
    @Column(name="course_name",nullable = false,length = 45)
    private String name;

    @Basic
    @Column(name="credits")
    private float credits;

    @Basic
    @Column(name="course_type")
    private String course_type;

    @Basic
    @Column(name="semester")
    private int semester;

    @Basic
    @Column(name="department_name")
    private String deptname;


    public Course(String name, float credits, String course_type, int semester, String deptname) {
        this.name = name;
        this.credits = credits;
        this.course_type = course_type;
        this.semester = semester;
        this.deptname = deptname;
    }

    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
