package model;

import java.util.ArrayList;

/**
 * Created by Andrzej on 2017-04-23.
 */
public class Subject {

    private String name;
    private ArrayList<Integer> listNotes = new ArrayList<>();

    public Subject(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNote(int note){
        listNotes.add(note);
    }

    public void addNote(Integer ...notes){
         for(Integer note : notes){
             listNotes.add(note);
         }
    }

    public String printNotes(){
        String printingListNotes = "";
        for(Integer note : listNotes){
            printingListNotes = printingListNotes + note + " ";
        }
        return printingListNotes;
    }

    public boolean removeNote(Integer note){
        return listNotes.remove(note);
    }
    @Override
    public String toString(){
        return "Nazwa przedmiotu: "+name+" Lista ocen:"+printNotes();
    }
}
