package com.cesarscode.springdemo;

public class ScienceTeacher implements Teacher{

	private TipService tip;
	
	public ScienceTeacher() {
		
	}
	public ScienceTeacher(TipService tip) 
	{
		this.tip = tip; 
	}
		
	@Override
	public String getExercise() 
	{
		return "Create 10 Lab Experiments"; 
	}
	@Override
	public String getTip() 
	{
		return tip.getTip(); 
	}
	public void setTip(TipService tip) 
	{
		this.tip = tip; 
	}
	
}
