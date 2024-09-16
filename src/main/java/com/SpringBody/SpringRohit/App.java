package com.SpringBody.SpringRohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Laptop1  obj = new Dell();
//        obj.disp();
        
    //  ApplicationContext context=new ClassPathXmlApplicationContext("College.xml");
      
      ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
      
    
//      Student obj = context.getBean(Student.class);
//      obj.disp();
      
     
//      Student student = context.getBean(Student.class);
//      student.disp();
      
//      College obj = context.getBean(College.class);
//      obj.disp();
      
      Admin admin = context.getBean(Admin.class);
      admin.manage();
      
      
      
      
//      Laptop1 obj =(Laptop1)context.getBean("dell");  
//      obj.disp();
      
//     College obj =(College)context.getBean("faculty");  
//     obj.disp();
      
//      Subject obj=(Subject)context.getBean("subject");
//  	System.out.println(obj);
  	
	
//  	Dell d=(Dell)context.getBean("dell");
//  	d.disp();
      
//      Student s=(Student)context.getBean("student");
//      s.disp();
      
//      College obj =(College)context.getBean("faculty");  
//      obj.disp();
    }
}