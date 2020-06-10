package com.company;
import java.io.IOException;
import java.io.*;
import java.util.*;


import reminderappread.reminderappread;

import java.time.LocalDateTime;
import  java.net.*;

public class Main {
    public static void MyGETRequest(reminderappread list) throws IOException {

        URL urlForGetRequest = new URL("https://getfestivo.com/v1/holidays?api_key=6098384c-38a7-44be-bdf6-d8e3cf60f6d4&country=US&year=2020");

        String readLine = null;

        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();

        conection.setRequestMethod("GET");

        conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here

        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {

            BufferedReader in = new BufferedReader(

                    new InputStreamReader(conection.getInputStream()));

            StringBuffer response = new StringBuffer();

            while ((readLine = in .readLine()) != null) {

                response.append(readLine);


            } in .close();

            // print result
           // String[] kkk = response.toString().split(":");
            System.out.println("JSON String Result " + response.toString());

            String[] items = response.toString().split(",");
            List<String> itemList = Arrays.asList(items);
            System.out.print(itemList);
            System.out.print("\n");
            System.out.print(itemList.get(16));
            String name1 = itemList.get(16).substring(8, 22);
            System.out.print("  " + name1);
            System.out.print(itemList.get(23));
            String name2 = itemList.get(23).substring(8, 30);
            System.out.print("  " + name2);
            System.out.print(itemList.get(30));
            String name3 = itemList.get(30).substring(8, (itemList.get(30).length() - 1));
             System.out.print("  " + name3);
            System.out.print(itemList.get(37));
            String name4 = itemList.get(37).substring(8, (itemList.get(37).length() - 1));
            System.out.print("  " + name4);
            System.out.print(itemList.get(44));
            String name5 = itemList.get(44).substring(8, (itemList.get(44).length() - 1));
            System.out.print("  " + name5);
            System.out.print(itemList.get(53));
            String name6 = itemList.get(53).substring(8, 14);
            System.out.print("  " + name6);
            System.out.print(itemList.get(58));
            String name7 = itemList.get(58).substring(8, (itemList.get(58).length() - 1));
            System.out.print("  " + name7);
            System.out.print(itemList.get(65));
            String name8 = itemList.get(65).substring(8, (itemList.get(65).length() - 1));
            System.out.print("  " + name8);
            System.out.print(itemList.get(72));
            String name9 = itemList.get(72).substring(8, (itemList.get(72).length() - 1));
            System.out.print("  " + name9);
            System.out.print(itemList.get(79));
            String name10 = itemList.get(79).substring(8, (itemList.get(79).length() - 1));
            System.out.print("  " + name10);
            System.out.print(itemList.get(87));
            String name11 = itemList.get(87).substring(8, (itemList.get(87).length() - 1));
            System.out.print("  " + name11);
            System.out.print(itemList.get(94));
            String name12 = itemList.get(94).substring(8, (itemList.get(94).length() - 1));
            System.out.print("  " + name12);
            System.out.print(itemList.get(101));
            String name13 = itemList.get(101).substring(8, (itemList.get(101).length() - 1));
            System.out.print("  " + name13);
            System.out.print(itemList.get(108));
            String name14 = itemList.get(108).substring(8, (itemList.get(108).length() - 1));
            System.out.print("  " + name14);
            System.out.print(itemList.get(115));
            String name15 = itemList.get(115).substring(8, (itemList.get(115).length() - 1));
            System.out.print("  " + name15);
            System.out.print(itemList.get(122));
            String name16 = itemList.get(122).substring(8, (itemList.get(122).length() - 1));
            System.out.print("  " + name16);
            System.out.print(itemList.get(129));
            String name17 = itemList.get(129).substring(8, (itemList.get(129).length() - 1));
            System.out.print("  " + name17);
            System.out.print(itemList.get(136));
            String name18 = itemList.get(136).substring(8, (itemList.get(136).length() - 1));
            System.out.print("  " + name18);
            System.out.print(itemList.get(143));
            String name19 = itemList.get(143).substring(8, (itemList.get(143).length() - 1));
            System.out.print("  " + name19);
            System.out.print(itemList.get(150));
            String name20 = itemList.get(150).substring(8, (itemList.get(150).length() - 1));
            System.out.print("  " + name20);



            System.out.print(itemList.get(13));
            String year1 = itemList.get(13).substring(21, 25);
            String month1 = itemList.get(13).substring(26,28);
            String day1 = itemList.get(13).substring(29,31);
            System.out.print("\n  " + year1 + " "+ month1+ " " + day1);
            System.out.print(itemList.get(20));
            String year2 = itemList.get(20).substring(9, 13);
            String month2 = itemList.get(20).substring(14,16);
            String day2 = itemList.get(20).substring(17,19);
            System.out.print(" " + year2 + " "+ month2+ " " + day2);
            System.out.print(itemList.get(27));
            String year3 = itemList.get(27).substring(9, 13);
            String month3 = itemList.get(27).substring(14,16);
            String day3 = itemList.get(27).substring(17,19);
            System.out.print(" " + year3 + " "+ month3+ " " + day3);
            System.out.print(itemList.get(34));
            String year4 = itemList.get(34).substring(9, 13);
            String month4 = itemList.get(34).substring(14,16);
            String day4 = itemList.get(34).substring(17,19);
            System.out.print(" " + year4 + " "+ month4+ " " + day4);
            System.out.print(itemList.get(41));
            String year5 = itemList.get(41).substring(9, 13);
            String month5 = itemList.get(41).substring(14,16);
            String day5 = itemList.get(41).substring(17,19);
            System.out.print(" " + year5 + " "+ month5+ " " + day5);
            System.out.print(itemList.get(48));
            String year6 = itemList.get(48).substring(9, 13);
            String month6 = itemList.get(48).substring(14,16);
            String day6 = itemList.get(48).substring(17,19);
            System.out.print(" " + year6 + " "+ month6+ " " + day6);
            System.out.print(itemList.get(55));
            String year7 = itemList.get(55).substring(9, 13);
            String month7 = itemList.get(55).substring(14,16);
            String day7 = itemList.get(55).substring(17,19);
            System.out.print(" " + year7 + " "+ month7+ " " + day7);
            System.out.print(itemList.get(62));
            String year8 = itemList.get(62).substring(9, 13);
            String month8 = itemList.get(62).substring(14,16);
            String day8 = itemList.get(62).substring(17,19);
            System.out.print(" " + year8 + " "+ month8+ " " + day8);
            System.out.print(itemList.get(69));
            String year9 = itemList.get(69).substring(9, 13);
            String month9 = itemList.get(69).substring(14,16);
            String day9 = itemList.get(69).substring(17,19);
            System.out.print(" " + year9 + " "+ month9+ " " + day9);
            System.out.print(itemList.get(76));
            String year10 = itemList.get(76).substring(9, 13);
            String month10 = itemList.get(76).substring(14,16);
            String day10 = itemList.get(76).substring(17,19);
            System.out.print(" " + year10 + " "+ month10+ " " + day10);
            System.out.print(itemList.get(84));
            String year11 = itemList.get(84).substring(9, 13);
            String month11 = itemList.get(84).substring(14,16);
            String day11 = itemList.get(84).substring(17,19);
            System.out.print(" " + year11 + " "+ month11+ " " + day11);
            System.out.print(itemList.get(91));
            String year12 = itemList.get(91).substring(9, 13);
            String month12 = itemList.get(91).substring(14,16);
            String day12 = itemList.get(91).substring(17,19);
            System.out.print(" " + year12 + " "+ month12+ " " + day12);
            System.out.print(itemList.get(98));
            String year13 = itemList.get(98).substring(9, 13);
            String month13 = itemList.get(98).substring(14,16);
            String day13 = itemList.get(98).substring(17,19);
            System.out.print(" " + year13 + " "+ month13+ " " + day13);
            System.out.print(itemList.get(105));
            String year14 = itemList.get(105).substring(9, 13);
            String month14 = itemList.get(105).substring(14,16);
            String day14 = itemList.get(105).substring(17,19);
            System.out.print(" " + year14 + " "+ month14+ " " + day14);
            System.out.print(itemList.get(112));
            String year15 = itemList.get(112).substring(9, 13);
            String month15 = itemList.get(112).substring(14,16);
            String day15 = itemList.get(112).substring(17,19);
            System.out.print(" " + year15 + " "+ month15+ " " + day15);
            System.out.print(itemList.get(119));
            String year16 = itemList.get(119).substring(9, 13);
            String month16 = itemList.get(119).substring(14,16);
            String day16 = itemList.get(119).substring(17,19);
            System.out.print(" " + year16 + " "+ month16+ " " + day16);
            System.out.print(itemList.get(126));
            String year17 = itemList.get(126).substring(9, 13);
            String month17 = itemList.get(126).substring(14,16);
            String day17 = itemList.get(126).substring(17,19);
            System.out.print(" " + year17 + " "+ month17+ " " + day17);
            System.out.print(itemList.get(133));
            String year18 = itemList.get(133).substring(9, 13);
            String month18 = itemList.get(133).substring(14,16);
            String day18 = itemList.get(133).substring(17,19);
            System.out.print(" " + year18 + " "+ month18+ " " + day18);
            System.out.print(itemList.get(140));
            String year19 = itemList.get(140).substring(9, 13);
            String month19 = itemList.get(140).substring(14,16);
            String day19 = itemList.get(140).substring(17,19);
            System.out.print(" " + year19 + " "+ month19+ " " + day19);
            System.out.print(itemList.get(147));
            String year20 = itemList.get(147).substring(9, 13);
            String month20 = itemList.get(147).substring(14,16);
            String day20 = itemList.get(147).substring(17,19);
            System.out.print(" " + year20 + " "+ month20+ " " + day20);

            list.reminderlists.get(0).addonetothelist(month1, year1, day1, name1, 0);
            list.reminderlists.get(0).addonetothelist(month2, year2, day2, name2, 0);
            list.reminderlists.get(0).addonetothelist(month3, year3, day3, name3, 0);
            list.reminderlists.get(0).addonetothelist(month4, year4, day4, name4, 0);
            list.reminderlists.get(0).addonetothelist(month5, year5, day5, name5, 0);
            list.reminderlists.get(0).addonetothelist(month6, year6, day6, name6, 0);
            list.reminderlists.get(0).addonetothelist(month7, year7, day7, name7, 0);
            list.reminderlists.get(0).addonetothelist(month8, year8, day8, name8, 0);
            list.reminderlists.get(0).addonetothelist(month9, year9, day9, name9, 0);
            list.reminderlists.get(0).addonetothelist(month10, year10, day10, name10, 0);
            list.reminderlists.get(0).addonetothelist(month11, year11, day11, name11, 0);
            list.reminderlists.get(0).addonetothelist(month12, year12, day12, name12, 0);
            list.reminderlists.get(0).addonetothelist(month13, year13, day13, name13, 0);
            list.reminderlists.get(0).addonetothelist(month14, year14, day14, name14, 0);
            list.reminderlists.get(0).addonetothelist(month15, year15, day15, name15, 0);
            list.reminderlists.get(0).addonetothelist(month16, year16, day16, name16, 0);
            list.reminderlists.get(0).addonetothelist(month17, year17, day17, name17, 0);
            list.reminderlists.get(0).addonetothelist(month18, year18, day18, name18, 0);
            list.reminderlists.get(0).addonetothelist(month19, year19, day19, name19, 0);
            list.reminderlists.get(0).addonetothelist(month20, year20, day20, name20, 0);

            list = new reminderappread();

            //GetAndPost.POSTRequest(response);

        } else {

            System.out.println("GET NOT WORKED");

        }

    }

    public static void  search(reminderappread list){
        int month;
        int day;
        int year;

        int m = 0;
        Scanner kevin = new Scanner(System.in);
        System.out.print("Please enter day and month and year");
        day = kevin.nextInt();
        month = kevin.nextInt();
        year = kevin.nextInt();
        kevin.close();
        int k = 0;
        for (int h = 0; h < list.reminderlists.size(); h++) {

            //list.reminderlists.get(h).print();
            if ((month == list.reminderlists.get(h).getmonth()) && (day == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())) {

                list.reminderlists.get(h).print();
                k++;
            }
            if(((month) == list.reminderlists.get(h).getmonth())&& ((day + 2) == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())){

                 list.reminderlists.get(h).print();
                k++;
            }
            if(((month)== list.reminderlists.get(h).getmonth()) && ((day + 1) == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())){

                list.reminderlists.get(h).print();
                k++;
            }
            if (((month) == list.reminderlists.get(h).getmonth()) && ((day+ 3) == list.reminderlists.get(h).getday() && (year == list.reminderlists.get(h).getyear()))) {

                list.reminderlists.get(h).print();
                k++;
            }
            if (((month) == list.reminderlists.get(h).getmonth()) && ((day + 4) == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())) {

                 list.reminderlists.get(h).print();
                k++;
            }
            if (((month) == list.reminderlists.get(h).getmonth()) && ((day + 5) == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())) {

                list.reminderlists.get(h).print();
                k++;
            }
            if (((month) == list.reminderlists.get(h).getmonth()) && (day + 6 == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())) {

                list.reminderlists.get(h).print();
                k++;
            }
            if (((month ) == list.reminderlists.get(h).getmonth()) && ((day + 7) == list.reminderlists.get(h).getday()) && (year == list.reminderlists.get(h).getyear())) {

                list.reminderlists.get(h).print();
                k++;
            }
        }
        if(k == 0){
            System.out.print("No dates found");
        }


        }
        public static void delete(LocalDateTime timestamp, reminderappread list, File file) throws IOException {

                        System.out.print("NNNNNNNNNNNNN");

                list.reminderlists.get(0).print();


                  for(int x = 0; x < list.reminderlists.size(); x++){


                      /*  System.out.print(timestamp.getYear());
                        System.out.print(timestamp.getDayOfMonth());
                        System.out.print(timestamp.getMonthValue())*/


                            if (list.reminderlists.get(x).getyear() < timestamp.getYear() && list.reminderlists.get(x).getisannual() != 1) {
                                //System.out.print(timestamp.getYear());
                                System.out.print(list.reminderlists.get(x).getyear());
                                System.out.print("kkkkkklllll1");
                                list.reminderlists.get(x).print();
                                list.reminderlists.remove(x);


                            }
                             else  if (list.reminderlists.get(x).getyear() == timestamp.getYear() && list.reminderlists.get(x).getmonth() < timestamp.getMonthValue() && list.reminderlists.get(x).getisannual() != 1) {

                                    System.out.print("kkkkkklllll2");
                                    list.reminderlists.get(x).print();
                                    list.reminderlists.remove(x);

                                }
                               else if (list.reminderlists.get(x).getyear() == timestamp.getYear() && list.reminderlists.get(x).getmonth() == timestamp.getMonthValue() && list.reminderlists.get(x).getday() < timestamp.getDayOfMonth() && list.reminderlists.get(x).getisannual() != 1) {
                                    System.out.print("kkkkkklllll3");
                                    list.reminderlists.get(x).print();
                                    list.reminderlists.remove(x);



                                }

                        }

                       for(int l = 0; l < list.reminderlists.size(); l++ ){
                           list.reminderlists.get(l).print();
                        }
           // File file = new File("datelist.txt");
            BufferedWriter bw = null;
            FileWriter fw = new FileWriter(file,  true);



            bw = new BufferedWriter(fw);
            try {
            for(int h = 0; h < list.reminderlists.size(); h++) {


                    bw.write(list.reminderlists.get(h).getmonth() + " " + list.reminderlists.get(h).getyear() + " " + list.reminderlists.get(h).getday() + " " + list.reminderlists.get(h).getisannual() +" " + list.reminderlists.get(h).getymessage() );
                   bw.newLine();
                   System.out.println("File written Successfully");



            }}catch(Exception io){}

                    bw.close();
                    }














    public static void main(String[] args) throws IOException {
        // write your code here
        int k = 0;
        File file = new File("datelist.txt");


        reminderappread list = new reminderappread();

        for(int y=0;y< list.reminderlists.size();y++){
            list.reminderlists.get(y).print();
        }

        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);


        for (int h = 0; h < list.reminderlists.size(); h++) {
            if ((timePoint.getMonthValue() == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear())
            {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 1 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 2 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 3 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 4 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 5 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 6 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }
            if ((timePoint.getMonthValue()  == list.reminderlists.get(h).getmonth()) && (timePoint.getDayOfMonth() + 7 == list.reminderlists.get(h).getday()) && timePoint.getYear() == list.reminderlists.get(h).getyear()) {

                list.reminderlists.get(h).print();
                k++;
            }


        }


        if(k == 0){
            System.out.println("No dates found");

        }
        System.out.println("Do you want to search a date 0r add a date");
        Scanner john = new Scanner(System.in);
        String x;
        x = john.nextLine();
       // john.close();
        if(x.contentEquals("yes")){

            search(list);
        }
        if(x.contentEquals("add")){
            String message1 = "";
            int day1 = 0, month1 = 0, year1 = 0;
            int isannual1 = 0;
            //Scanner mmm = new Scanner(System.in);

           // while (mmm.hasNext()) {

                System.out.println("please enter name");
                message1 = new String(john.nextLine());

                System.out.println("please enter day");
                 day1 = john.nextInt();
                System.out.println("please enter month");
                 month1 = john.nextInt();
            System.out.println("please enter year");
            year1 = john.nextInt();
            System.out.println("does this happen every year enter yes");
            String yes;
            yes = john.next();
            if(yes.contentEquals("yes")){
                isannual1 =  1;

            }
            //}


            list.addonetothelist(month1,year1, day1, message1, isannual1);
            list = new reminderappread();
            for(int l = 0; l < list.reminderlists.size(); l++ ){
                list.reminderlists.get(l).print();
            }
            john.close();

        }
        file.delete();
        delete(timePoint, list, file);
       // MyGETRequest(list);
    }
}