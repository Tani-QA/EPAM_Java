package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        //1 minute = 60 seconds
        //1 hour = 3600 seconds (60 * 60)
        //1 day = 86400 second (24 * 3600)

        int hours = seconds / 3600;
        //    System.out.println ("hours = " + hours);

      //  int hours2 = seconds % 86400 / 3600;
      //  System.out.println ("hours2 = " + hours2);

        int minutes = (seconds % 3600) /60; //или (seconds-hours*3600)/60
     //   System.out.println ("minutes = " + minutes);

        int seconds1 = seconds  % 60;
     //   System.out.println ("seconds1 = " + seconds1);

        String hours1 = (hours < 24)? "" + hours: (hours==24)? "0" :Integer.toString(hours) ;
        System.out.printf ( hours1 + ":" + "%02d:%02d", minutes, seconds1); //%02d остается число 2уразрядным

        //timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        //System.out.println(timeString);
        //System.out.println("\n"+hours2+ ":" +minutes+ ":" +seconds1);
    }
}
