package sem451;

import java.util.*;
public class Age {
	 Scanner sc=new Scanner(System.in);
	 
	private int age; 
	
	public void AGE() {
	
		try{age=sc.nextInt();}
				
	    catch(Exception e) {
	    	System.out.println("Error,Wtite The Age as a Number :");  
	    	age=sc.nextInt();
	       }
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		this.age = age;
	 }
  }