package com.technotab.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technotab.limits.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public LimitsConfiguration returnLimits() {
		
		return new LimitsConfiguration(limitsConfiguration.getMaximum(), limitsConfiguration.getMinimum());
		
	}

}
