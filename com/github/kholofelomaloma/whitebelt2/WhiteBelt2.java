package com.github.kholofelomaloma.whitebelt2;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
 
public class WhiteBelt2 {
 
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("It is now :"+now);
         
        LocalDateTime temDaysFromNow = now.plus(10, ChronoUnit.DAYS);
         
        System.out.println("Now did not change, it is immutable (will never change) :"+now);       
        System.out.println("Ten days from now is "+temDaysFromNow);
    }
}
