package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Куликов А.В.");
        student.setGroup(123);
        student.setDate("01/07/2001");

        System.out.println("Студент " + student.getName() + " зачислен в группу № "
                + student.getGroup() + " " + student.getDate());
    }
}
