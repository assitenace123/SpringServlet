package com.SpringBody.SpringRohit;

import org.springframework.stereotype.Component;

//@Component
public class Subject {
//private String sub;
//
//public String getSub() {
//	return sub;
//}
//
//@Override
//public String toString() {
//	return "JAVA";
//}
//
//public Subject(String sub) {
//	super();
//	this.sub = sub;
//}
//
//public void setSub(String sub) {
//	this.sub = sub;
	private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
}
    
}