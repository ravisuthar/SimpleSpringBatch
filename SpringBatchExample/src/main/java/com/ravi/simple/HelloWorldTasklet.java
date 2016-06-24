package com.ravi.simple;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorldTasklet  implements Tasklet, InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("hello world afterPropertiesSet called..........");
		
	}

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		System.out.println("hello world executed..........");
		return null;
	}

}
