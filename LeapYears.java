/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyears;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class LeapYears {
    public static void main(String[] args) {
        int years;
        Scanner InputYears = new Scanner(System.in);
        System.out.println("Please enter the year you want : ");
        years = InputYears.nextInt();
        boolean leapyear = false;
        if(years % 4 == 0){
            if(years % 100 == 0){
                if(years % 400 == 0){
                    leapyear = true;
                }
                else{
                    leapyear = false;
                }
            }
            else{
                leapyear = true;
            }
        }
        else{
            leapyear = false;
        }
        
        if (leapyear == true){
            System.out.println(years + " " + "is a leap Year.");
        }
        else{
            System.out.println(years + " " + "is not a leap Year.");
        }
    }
}

