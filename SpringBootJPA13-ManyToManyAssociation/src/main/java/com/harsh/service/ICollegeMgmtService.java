package com.harsh.service;

import com.harsh.entity.Faculty;
import com.harsh.entity.Student;

public interface ICollegeMgmtService {
    public  String   registerFacultiesAndStudents(Iterable<Faculty> list);
    public  String   registerStudentsAndFaculties(Iterable<Student> list);
    public   Iterable<Faculty>  showFacultiesAndTheirStudents();
    public   String    removeStudentsFromAFaculty(Iterable<Integer> sids, int fid);
    
}
