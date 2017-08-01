package com.tc.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tc.beans.Employee;

public class Test 
{
    public static void main( String[] args )
    {
    	ClassPathResource resource=new ClassPathResource("com/tc/config/applicationContext.xml");
    	BeanFactory factory=new XmlBeanFactory(resource);
    	Employee emp=factory.getBean("std", Employee.class);
    	emp.show();
    }
}
