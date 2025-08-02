package com.harsh.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("blueDart")
@Lazy(true)
public class BlueDart implements ICourier {

	public BlueDart() {
		super();
		System.out.println("BlueDart :: o param constructor");
	}

	@Override
	public String deliver(int oId) {

		return oId + " order item is keep for delivery by BlueDart.";
	}

}
