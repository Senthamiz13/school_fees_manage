package com.company;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        teachers latha = new teachers(01,"latha",500);
        teachers ram = new teachers(02,"ram",800);

        List<teachers> teachersList = new ArrayList<>();
        teachersList.add(latha);
        teachersList.add(ram);

        students janani = new students(502,"janani",5);
        students kavin = new students(503,"kavin",6);

        List<students> studentsList =new ArrayList<>();
        studentsList.add(janani);
        studentsList.add(kavin);

        school AHSS =new school(teachersList,studentsList);
        janani.updateFeesPaid(500);

        System.out.println("AHSS has earned $"+AHSS.getTotalMoneyEarned());
        kavin.updateFeesPaid(5000);

        System.out.println("AHSS has earned $"+AHSS.getTotalMoneyEarned());

        ////school pay salary//
        latha.recieveSalary(latha.getSalary());
        System.out.println("AHSS has remaining $"+AHSS.getTotalMoneyEarned());



    }
}
