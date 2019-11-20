package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.Course;
import com.ahmedrafayat.model.Faculty;

import java.util.List;

public interface courseDao {
    public List<Course> getCourseList();
    public List<Course> getCoursewithParams(String department);
}
