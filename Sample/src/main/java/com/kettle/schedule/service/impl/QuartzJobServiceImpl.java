package com.kettle.schedule.service.impl;

import com.kettle.schedule.service.QuartzJobService;

public class QuartzJobServiceImpl implements QuartzJobService {

	@Override
	public void printLog() {
		System.out.println("test log");
	}
	
}
