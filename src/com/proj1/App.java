package com.proj1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int nStud = sc.nextInt();
        Student[] student = new Student[10];
        for (int i = 0; i < nStud; i++) {
            student[i] = new Student();
            student[i].setStudInfo();
        }
        System.out.println("---------------------------------------------------------");
        double clsAvg =0;
        System.out.println("Nwme\t\tRegNo\t\t\tMarks\t\t\t\tTotal\tAverage");
        for (int i = 0; i < nStud; i++) {
            student[i].disStudInfo();
            clsAvg += student[i].getAvg();
        }
        clsAvg /= 5.0;
        System.out.println("---------------------------------------------------------");
        System.out.println("The student scoring below average ("+clsAvg+") is : ");
        for(int i =0;i<nStud;i++)
            if(student[i].getAvg()<clsAvg)
                student[i].disStudInfo();
    }
}
