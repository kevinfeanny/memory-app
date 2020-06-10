package reminderlist;

import reminderappread.reminderappread;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class reminderlist {

    public ArrayList<reminderappread> reminderlists = new ArrayList<reminderappread>();
    int x;
    public reminderlist() throws FileNotFoundException {
        x= 0;
        while(x != 2) {
            x++;
            reminderlists.add(new reminderappread());
        }
    }
    public void print(){
        for(int x = 0; x <= reminderlists.size(); x++){
        reminderlists.get(x).print();}
    }


}




