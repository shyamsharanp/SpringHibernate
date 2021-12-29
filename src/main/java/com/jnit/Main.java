package com.jnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
 
        StudentSelect studentselect = (StudentSelect) context.getBean("studentselect");
 
        Student s = new Student();
        s.setSid(103);
        s.setMarks(290);
        s.setName("Boby");
        
        studentselect.saveStudent(s);
        
        context.close();
        
    }
}
