package com.SpringBody.SpringRohit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.SpringBody.SpringRohit")
public class CollegeConfig {
    
   //@Bean
//    public Student getdisp() {
//        return new Student();
//    }
//	public Subject getsubject() {
//        return new Subject("Advanced Java");
//    }
//	@Bean
//    public Subject subject() {
//        return new Subject("Advance Java");
//    }
	
	
	@Bean
    public College getCollege() {
        return new Student(); // Student implements College
    }
    
    @Bean
    public Subject subject() {
        return new Subject("Advanced Java");
    }
//    
//    @Bean
//    public Student student() {
//        Student student = new Student();
//        student.setSub(subject());  // Injecting dependency
//        return student;
}