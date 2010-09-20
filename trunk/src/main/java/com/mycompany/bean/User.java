package com.mycompany.bean;



public class User {

	   private String name="";

	   public String getName() {
		   System.out.println("-------------------get user name =" + name);
	      return name;
	   }

	   public void setName(String name) {
		   System.out.println("*******************set user name =" + name);
	      this.name = name;
	   }

	}
