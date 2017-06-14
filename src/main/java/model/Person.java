package model;

/**
 * Created by Andrzej on 2017-04-16.
 */
public abstract class Person {

    private static int idIteration = 1;
    private final int id;
    private String name;
    private String surname;


    public Person (String name,String surname){
        this.id = idIteration;
        idIteration++;
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String toString();
}
