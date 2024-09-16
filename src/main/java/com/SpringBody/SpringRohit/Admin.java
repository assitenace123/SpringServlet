package com.SpringBody.SpringRohit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // This makes Admin a Spring bean
public class Admin {

    private College college;

    @Autowired
    public Admin(@Qualifier("faculty") College college) { // You can change this to inject a specific implementation
        this.college = college;
    }

    public void manage() {
        college.disp();
    }
}