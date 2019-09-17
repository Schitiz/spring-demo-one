package com.schitiz.springdemo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "You have your lucky day today";
	}
}
