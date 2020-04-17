package com.kettle.schedule;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.kettle.schedule.service.QuartzJobService;

public class SimpleQuartzJob extends QuartzJobBean{
	
	private QuartzJobService quartzJobService;
	public void setQuartzJobService(QuartzJobService quartzJobService) {
		this.quartzJobService = quartzJobService;
	}

	@Override
	protected void executeInternal(JobExecutionContext ex)throws JobExecutionException {
		quartzJobService.printLog();
	}
	
}
