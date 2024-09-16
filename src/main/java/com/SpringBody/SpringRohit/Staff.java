package com.SpringBody.SpringRohit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Staff implements College {

    @Autowired
    private Subject sub;

    @Override
    public void disp() {
        System.out.println("Staff handles administrative tasks and knows about " + sub.getName());
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }
}