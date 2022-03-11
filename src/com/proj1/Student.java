package com.proj1;

import java.util.Scanner;

class Student {
    private String name;
    private String reg_no;
    private final int[] marks = new int[5];
    private int total;
    private double avg;
    Scanner sc = new Scanner(System.in);

    public void setStudInfo() {
        System.out.println("Enter the Student Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter the student register number :");
        this.reg_no = sc.nextLine();
        System.out.println("Enter the student marks : ");
        this.total = 0;
        for (int j = 0; j < 5; j++) {
            this.marks[j] = sc.nextInt();
            this.total += this.marks[j];
        }
        this.avg = this.total / 5.0;
    }

    public void disStudInfo() {
        System.out.print(this.name + "\t\t" + this.reg_no + "\t");
        for (int j = 0; j < 5; j++)
            System.out.print(this.marks[j] + "\t");
        System.out.println(this.total + "\t\t" + this.avg);
    }

    public double getAvg() {
        return this.avg;
    }

    public String getRegNo() {
        return this.reg_no;
    }

    public String getName() {
        return this.name;
    }

    public int getTotal() {
        return this.total;
    }

    public int[] getMarks() {
        return this.marks;
    }
}
