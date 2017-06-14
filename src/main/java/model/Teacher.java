package model;

/**
 * Created by Andrzej on 2017-04-16.
 */
public class Teacher extends Person {
    public Teacher (String name,String surname){
        super(name,surname);
    }

    @Override
    public String toString() {
        return "\nID: "+this.getId()+" Name: "+ this.getName() +" Surname: "+this.getSurname();
    }


}
