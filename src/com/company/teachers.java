package com.company;/// com.company.teachers class

public class teachers {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    ///////constructor foe teacher class

    public teachers(int id, String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;

    }
//////////// setting  salary info///////////
    public void gotSalary(int salary){
        this.salary = salary;
    }

    //////////// adds to salary earned
        public void recieveSalary(int salary) {
        salaryEarned += salary;
        school.updateTotalMoneySpent(salary);
    }
}
