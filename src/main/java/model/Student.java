package model;

import java.util.HashSet;

/**
 * Created by Andrzej on 2017-04-16.
 */
public class Student extends Person {

    private HashSet<Subject> listSubject = new HashSet<>();

    public Student(String name, String surname){
        super(name,surname);
    }

    public void addSubject (Subject subject){
        listSubject.add(subject);
    }
    public void addSubject (String nameSubject){
        listSubject.add(new Subject(nameSubject));
    }

    public String printSubject(){
        String printingListSubject = "";
        for(Subject subject : listSubject){
            printingListSubject = printingListSubject + subject + " ";
        }
        return  printingListSubject;
    }
    public boolean removeSubject(Subject subject){
        return listSubject.remove(subject);
    }

    @Override
    public String toString() {
        return "\nID: "+this.getId()+" Name: "+ this.getName() +" Surname: "+this.getSurname() +" "+ listSubject.toString();
    }
}
