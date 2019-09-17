package com.schitiz.springdemo;

public class BaseballCoach implements Coach{
	
	//Create a private field in your class for injection
	private FortuneService fortuneService;
	
	//define a constructor for this class
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on Batting Practice";
    }

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
