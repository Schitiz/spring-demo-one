package com.schitiz.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5 kms";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
