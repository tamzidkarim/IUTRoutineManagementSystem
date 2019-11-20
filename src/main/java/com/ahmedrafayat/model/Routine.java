package com.ahmedrafayat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "routine", schema = "iutroutine", catalog = "",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"slot_number", "semester","department_name","class_day"},name="unique_routine")})
public class Routine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="routine_id",nullable = false,unique = true)
    private int id;

    @Basic
    @Column(name="class_day",nullable = false)
    private String day;

    @Basic
    @Column(name="slot_number",nullable = false)
    private int sltnmb;

    @Basic
    @Column(name="semester",nullable = false)
    private String semester;

    @Basic
    @Column(name="room_name",nullable = false)
    private String roomname;

    @Basic
    @Column(name="department_name",nullable = false)
    private String departmentname;

    @Basic
    @Column(name="course_id",nullable = false)
    private String courseid;

    @Basic
    @Column(name="faculty_name",nullable = false)
    private String facultyname;

    public Routine(int id,String day, int sltnmb, String semester, String roomname, String departmentname, String courseid, String facultyname) {
        this.day = day;
        this.sltnmb = sltnmb;
        this.semester = semester;
        this.roomname = roomname;
        this.departmentname = departmentname;
        this.courseid = courseid;
        this.facultyname = facultyname;
    }

    public Routine(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getSltnmb() {
        return sltnmb;
    }

    public void setSltnmb(int sltnmb) {
        this.sltnmb = sltnmb;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    @Override
    public String toString() {
        return "Routine{" +
                "id=" + id +
                ", day='" + day + '\'' +
                ", sltnmb=" + sltnmb +
                ", semester=" + semester +
                ", roomname='" + roomname + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", courseid='" + courseid + '\'' +
                ", facultyname='" + facultyname + '\'' +
                '}';
    }
}
