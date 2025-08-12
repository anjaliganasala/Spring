package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimTest {
	
  @Autowired
  @Qualifier("jio")         //  qualifier have higher precedence it take first
  private Sim sim;
  
  public void callSim() {
	  sim.call();
  }
  
  
}
