package exampleDate;

import model.ClassSchool;
import model.Student;
import model.Subject;
import model.Teacher;

/**
 * Created by Andrzej on 2017-04-23.
 */
public class GeneratorDate {

    private ClassSchool classschool;

    public GeneratorDate(){
        classschool = new ClassSchool("Class A");
        classschool.addTeacher(new Teacher("Tom", "John"));
        classschool.addTeacher(new Teacher("Jon","Jon"));
        classschool.addStudent("NameStudent1", "SurnameStudent2");
        classschool.addStudent("NameStudent2", "SurnameStudent2");
        Subject subject1 = new Subject("NameSubject1");
        Subject subject2 = new Subject("NameSubject2");
        subject1.addNote(2);
        subject1.addNote(5);
        Student student = new Student("Student3", "SurnameStudent3");
        student.addSubject(subject1);
        student.addSubject(subject2);
        classschool.addStudent(student);

    }

    public ClassSchool getClassschool(){
        return classschool;
    }

}
