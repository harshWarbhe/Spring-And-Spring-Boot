package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value = "com/harsh/commons/Info.properties")
public class PersonInfo {

	// injecting value of properties file to spring bean properties
	@Value("${per.id}")
	private Integer pid;

	@Value("${per.name}")
	private String pname;

	@Value("${per.addrs}")
	private String address;

	// injecting direct value to spring bean properties
	@Value("7798385700")
	private long mobileNo;

	// injecting system value to spring bean properties
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version)}")
	private String os_version;

	// injecting envi value to spring bean properties
	@Value("${Path}")
	private String envi_path;

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", os_name=" + os_name + ", os_version=" + os_version + ", envi_path=" + envi_path + "]";
	}

}
