package com.sy.smartrm.smartrmmonolith;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.sy.smartrm.smartrmmonolith")
@MapperScan({"com.sy.smartrm.smartrmmonolith.device.infrastructure.mapper",
		"com.sy.smartrm.smartrmmonolith.user.infrastructure.mapper",
		"com.sy.smartrm.smartrmmonolith.payment.infrastructure.mapper",
		"com.sy.smartrm.smartrmmonolith.trade.infrastructure.mapper",
		"com.sy.smartrm.smartrmmonolith.infracore.idgenerator.impl.mapper",
		"com.sy.smartrm.smartrmmonolith.operation.infrastructure.mapper"})
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class SmartrmMonolithApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartrmMonolithApplication.class, args);
	}

}
