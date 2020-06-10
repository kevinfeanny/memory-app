


package reminderappread;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class reminderappread {

    int month;
    int day;
    int year;
     int isannual;
    String message;
    public ArrayList<reminderappread> reminderlists = new ArrayList<reminderappread>();


    public reminderappread() throws FileNotFoundException {

        month = 0;
        day = 0;
        year = 0;
        isannual = 0;
        message = null;
       // File file = new File("datelist.txt");
        System.out.println("kkkk");
        try {
                File file = new File("datelist.txt");

                /* This logic will make sure that the file
                 * gets created if it is not present at the
                 * specified location*/
                if (!file.exists()) {
                    file.createNewFile();
                }

            Scanner sc = new Scanner(file);
                while(sc.hasNextInt()) {
                    month = sc.nextInt();
                    year= sc.nextInt();
                    day = sc.nextInt();


                    isannual = sc.nextInt();
                    message = sc.nextLine();

                    reminderlists.add(new reminderappread(month, day,year, isannual, message));


                }
            sc.close();

        }
        catch (FileNotFoundException e) {
            System.out.println('x');
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public reminderappread( int x,int  y, int h,int k, String m ){
        month = x;
        day = y;
        year = h;
        message = m;
      isannual= k;



    }
    public void print(){
        System.out.print(month);
        System.out.print(day);
        System.out.print(year);
        System.out.println(message);



    }
    public int search(int day1, int month1, int year1){
        int l= 0;
        System.out.print(day1);
        System.out.print(month1);
        for(int x= 0; x < reminderlists.size(); x++){
            reminderlists.get(x).print();
            if(month1 == reminderlists.get(x).getmonth()  && day1 == reminderlists.get(x).getday() && year1 == reminderlists.get(x).getyear()) {
                l = 1;

            }
            }
        System.out.print(l);
            return l;

        }





  public void  addonetothelist(int month1 ,int year1, int day1, String message1, int isannual1){
      BufferedWriter bw = null;

      int x = search(month1, day1, year1);
      if(x == 0) {
          try {
              File file = new File("datelist.txt");

              /* This logic will make sure that the file
               * gets created if it is not present at the
               * specified location*/
              if (!file.exists()) {
                  file.createNewFile();
              }

              FileWriter fw = new FileWriter(file,true);
              bw = new BufferedWriter(fw);
              bw.newLine();
              /*bw.write( month1);
              bw.write("    ");
              bw.write(day1);
              bw.write("    ");*/
              bw.write(month1 + " " + year1 +" "+    day1  + " "  + isannual1 +  " " + message1 );
              System.out.println("File written Successfully");

          } catch (IOException ioe) {
              ioe.printStackTrace();
          } finally {
              try {
                  if (bw != null)
                      bw.close();
              } catch (Exception ex) {
                  System.out.println("Error in closing the BufferedWriter" + ex);
              }
          }
      }
      else {
          System.out.println("You have added this date already");
      }
  }
    public void  addonetothelist(String month1 ,String year1, String day1, String message1, int isannual1){
        BufferedWriter bw = null;



            try {
                File file = new File("datelist.txt");

                /* This logic will make sure that the file
                 * gets created if it is not present at the
                 * specified location*/
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file,true);
                bw = new BufferedWriter(fw);
                bw.newLine();
              /*bw.write( month1);
              bw.write("    ");
              bw.write(day1);
              bw.write("    ");*/
                bw.write(month1 + " " + year1 +" "+    day1  + " "  + isannual1 +  " " + message1 );
                System.out.println("File written Successfully");

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if (bw != null)
                        bw.close();
                } catch (Exception ex) {
                    System.out.println("Error in closing the BufferedWriter" + ex);
                }
            }

    }




    public int getmonth(){

        return month;
    }
    public int getday(){
        return day;
    }
    public  int getyear(){ return year;}
    public  String getymessage(){ return message;}
    public  int getisannual(){return isannual;}
    



    }


