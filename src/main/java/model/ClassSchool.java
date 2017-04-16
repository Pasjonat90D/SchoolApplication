package model;

import java.util.ArrayList;

/**
 * Created by Andrzej on 2017-04-16.
 */
public class ClassSchool {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();


    public void addStudent(Student stundet){
        students.add(stundet);
    }

    public void addStundet(String name,String surname){
        addStudent(new Student(name,surname));
    }


    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addTeacher(String name,String surname){
        addTeacher(new Teacher(name,surname));
    }




}
