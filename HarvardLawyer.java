package Assignments;

public class HarvardLawyer extends Lawyer{
	    public double getSalary(){
	        return super.getSalary()*1.20;
	    }
	    public int getVacationDays(){
	        return super.getVacationDays()+3;
	    }
	    public String getVacationForm(){
	        String form=super.getVacationForm();
	        return form+form+form+form;
	    }
	}