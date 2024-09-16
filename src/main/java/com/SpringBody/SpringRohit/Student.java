package com.SpringBody.SpringRohit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements College 
{
	@Autowired
    private Subject sub;

    @Override
    public void disp() {
        System.out.println("Student reads " + sub.getName());
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }
//	@Autowired
//	private Subject sub;
//	public Subject getSub() {
//		return sub;
//	}
//	public void setSub(Subject sub) {
//		this.sub = sub;
//	}
//	public void disp()
//	{
		//System.out.println("Student read "+sub);
		//System.out.println("Student read java");
//		if (sub != null) {
//            System.out.println("Student is reading: " + sub.getName());
//        } else {
//            System.out.println("Student is reading Java");
//        }
	}