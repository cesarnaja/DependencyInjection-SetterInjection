package com.cesarscode.springdemo;

public class MathTeacher implements Teacher {

	private TipService tip;
	
	public MathTeacher() {
		
	}
	public MathTeacher(TipService tip) {
		this.tip = tip; 
	}
	
	@Override
	public String getExercise() {
		
		return "Solve 30 Algebra Questions ";
	}

	@Override
	public String getTip() {
		
		return tip.getTip();
	}
	public void setTip(TipService tip) 
	{
		this.tip = tip; 
	}

}
