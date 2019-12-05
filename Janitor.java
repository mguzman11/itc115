package Assignments;

public class Janitor extends Employee{
    public double getSalary(){
        return super.getSalary()-10000.00;
    }
    public int getVacationDays(){
        return super.getVacationDays()/2;
    }
    public int getHours(){
        return super.getHours()*2;
    }
    public void clean(){
        System.out.println("Workin' for the man.");
    }
}