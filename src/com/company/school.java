package com.company;

import java.util.List;

public class school {

    /////////attributes////////////////////

    private List<teachers> teachersList;
    private List<students> studentsList;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    ////////////////constructors////////////

    /**
     *
     * @param teachersList list of techers
     * @param studentsList list of students
     */
    public school(List<teachers> teachersList, List<students> studentsList) {
        this.teachersList = teachersList;
        this.studentsList = studentsList;
    }

    public List<teachers> getTeachersList() {
        return teachersList;
    }
    ///// adds a teacher to school
    public void addTeacher(teachers teacher) {
        teachersList.add(teacher);
    }

    //////////////////////////////////////////////////////

    /// retrun list of students
    public List<students> getStudentsList() {
        return studentsList;
    }

    public void addStudent(students student) {
        studentsList.add(student);
    }

    ///////////////////////////////////////////////////////

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
//// update money with given by the school
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent ;
    }
}
