//DTDC.java => Dependency class
package com.harsh.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")

//@Component("courier")		//by matching name

//@Primary

@Lazy(true)
public class DTDC implements ICourier {

	public DTDC() {
		super();
		System.out.println("DTDC :: o param constructor");
	}

	@Override
	public String deliver(int oId) {
		
		return oId+" order item is keep for delivery by DTDC.";
	}

}


