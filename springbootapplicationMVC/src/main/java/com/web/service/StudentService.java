package com.web.service;

import java.util.List;
import com.web.model.Student;

public interface StudentService {
    public Student savestudent(Student student);
    public Student updateestudent(Student student);
    public void deletestudent(int stdId);
    public Student getstudent(int stdId);
    public List<Student> getallstudents();
}

