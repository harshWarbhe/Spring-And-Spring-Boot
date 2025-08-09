package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

	@Value("12345")
	private Integer hotelId;
	
	@Value("${hotel.name}")
	private String hotelName;
	
	@Value("${hotel.addrs}")
	private String Address;
	
	@Value("${hotel.contNo}")
	private Long MobileNo;
	
	@Value("${customer.name}")
	private String custName;
	
	@Value("#{menuPrice.dosarate + menuPrice.bondarate}")
	private float billAmount;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${user.name}")
	private String WindowUser;
	
	@Value("${path}")
	private String path;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ",\n hotelName=" + hotelName + ",\n Address=" + Address + ",\n MobileNo="
				+ MobileNo + ",\n custName=" + custName + ",\n billAmount=" + billAmount + ",\n osName=" + osName
				+ ",\n WindowUser=" + WindowUser + ",\n path=" + path + "]";
	}
	
	
}
