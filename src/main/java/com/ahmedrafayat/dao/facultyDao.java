package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.Faculty;

import java.util.List;

public interface facultyDao {
    public List<Faculty> getFacultyList();
    public List<Faculty> getFacultywithParams(String department);
    public int addFaculty(Faculty faculty);
}
