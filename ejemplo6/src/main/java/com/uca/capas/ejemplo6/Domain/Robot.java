package com.uca.capas.ejemplo6.Domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Eres un robot!!!!")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}