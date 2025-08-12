package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary                                 // always pic Airtel
public class Airtel implements Sim {

	@Override
	public void call() {
        System.out.println("Airtel Calling");		
	}

}
