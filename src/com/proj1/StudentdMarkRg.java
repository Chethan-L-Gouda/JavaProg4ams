package com.proj1;

public class StudentdMarkRg {
    private Student[] students = new Student[500];
    int cls_avg;
    int nStuds;
    public StudentdMarkRg(int n){}
    public void setStudDets(){
        for(int i =0;i<this.nStuds;i++){
            students[i]=new Student();
            students[i].setStudInfo();
        }
    }
    public void getStudDets(){
        System.out.println("Name\t\tRegNo\t\t\tMarks\t\t\t\tTotal\tAverage");
        for(int i =0;i<this.nStuds;i++)
            students[i].disStudInfo();
    }
    public void getStudDets(String re) {
        int curs, lB = 0, uB = nStuds - 1,pos= -1;
        boolean stdFound = false;
        while (lB <= uB) {
            curs = (lB+uB)/2;
            if(students[curs].getRegNo().compareTo(re)==0){
                stdFound = true;
                pos=curs;
                break;
            }
            else if(students[curs].getRegNo().compareTo(re)<0)
                uB = curs-1;
            else if(students[curs].getRegNo().compareTo(re)>0)
                lB = curs+1;
        }
        if(stdFound)
            students[pos].disStudInfo();
        else System.out.println("The student with Reg.no "+re+" not found");
    }
    public int getClassAvg(){
        this.cls_avg = 0;
        for(int i=0;i<nStuds;i++)
            this.cls_avg += students[i].getAvg();
        this.cls_avg /= nStuds;
        return this.cls_avg;
    }
    public void disFailStud(){
        for(int i =0;i<nStuds;i++)
            if(students[i].getAvg() < this.getClassAvg())
                students[i].disStudInfo();
    }
}
