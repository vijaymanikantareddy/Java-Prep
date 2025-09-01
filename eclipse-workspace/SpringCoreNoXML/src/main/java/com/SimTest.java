package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SimTest {

	@Autowired
	@Qualifier("jio")
	private Sim sim;

	public void callSim() {
		sim.call();
	}

}
