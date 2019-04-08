package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
public class Dependency_CheckTest {

	public static void main(String[] args) {
                System.out.println("this is Spring Project");
		System.out.println("Dependency_CheckTest.main():start");
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Person person=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		person=factory.getBean("person",Person.class);
		System.out.println(person);
		

	}

}
