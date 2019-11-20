package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.Routine;

import java.util.List;

public interface routineDao {
    public int addRoutine(Routine routine);
    public int editRoutine(Routine routine);
    public List<Routine> getRoutineList(int sem, String dept_name);
}
