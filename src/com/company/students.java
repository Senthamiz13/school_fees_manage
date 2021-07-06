package com.company;

// com.company.students classs
public class students {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

   /// constructor for com.company.students object
    public students(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        /// initializing fees attributes
        feesPaid = 0;
        feesTotal = 30000;
    }
    /////name id are fixed during object creation

    /////// setters ////////
    public void setGrade(int grade){   ///update com.company.students grade
        this.grade = grade;
    }

    public void updateFeesPaid(int fees){
        feesPaid += fees;
        school.updateMoneyEarned(feesPaid);
    }

    ///////// getters ////////

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int feesRemaing() {
        return (feesTotal - feesPaid);
    }

}
