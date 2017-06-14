package model;

import java.util.ArrayList;

/**
 * Created by Andrzej on 2017-04-16.
 */
public class ClassSchool {

    private String name = "";
    private ArrayList<Student> listStudents = new ArrayList<>();
    private ArrayList<Teacher> listTeachers = new ArrayList<>();


    public ClassSchool(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        listStudents.add(student);
    }

    public void addStudent(String name, String surname) {
        addStudent(new Student(name, surname));
    }


    public void addTeacher(Teacher teacher) {
        listTeachers.add(teacher);
    }

    public void addTeacher(String name, String surname) {
        addTeacher(new Teacher(name, surname));
    }

    public String printStudents() {
        String printingListStudent = "";
        for (Student student : listStudents) {
            printingListStudent = printingListStudent + student;
        }
        return printingListStudent;
    }

    public String printTeachers() {
        String printingListTeacher = "";
        for (Teacher teacher : listTeachers) {
            printingListTeacher = printingListTeacher + teacher;
        }
        return printingListTeacher;
    }

    public boolean removeStudent(Student student) {
        return listStudents.remove(student);
    }

    public boolean removeStudent(int id) {
        if (listStudents.remove(id) == null) {
            return false;
        }
        return true;
    }

    public boolean removeTeacher(Teacher teacher) {
        return listTeachers.remove(teacher);
    }

    public boolean removeTeacher(int id) {
        if (listTeachers.remove(id) == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nazwa klasy: " + name + "\nLista Studentów: " + printStudents() +
                "\nLista Nauczycieli:" + printTeachers();

    }


}
