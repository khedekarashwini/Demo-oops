package com.inhritance.demo;


class Parent1
{
  public void show()
  
  {
	  System.out.println("In side parent");
  }
}
class Child1 extends Parent
{
	
	public void show()
	  
	  {
		  System.out.println("In side child class");
	  }

public void display()
	{
		
		System.out.println("In side child");
	}
}
public class Test123 {

	public static void main(String[] args) {
		
		
	Child1 c=new Child1();
	  c.display();
	  c.show();
	    

	}

}
