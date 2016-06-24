package com.ravi.simple;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("job-hello-world.xml")) {
			//ApplicationContext context=new ClassPathXmlApplicationContext("job-hello-world.xml")); 
			Job job = (Job) context.getBean("helloWorldJob");
			JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			JobExecution execution = (JobExecution) jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");

	}
}
