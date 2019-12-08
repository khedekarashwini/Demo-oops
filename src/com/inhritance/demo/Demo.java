package com.inhritance.demo;
class Parent
{
   public void show()
   {
	   System.out.println("In side parent");
	   
   }
}
class Child extends Parent
{
    public void display()
    {
    	System.out.println("In side child");
    }
}
public class Demo {

	public static void main(String[] args) {

	   // B b=new B();
	    
	Parent p=new Child();
	  p.show();
	//Child c=new Parent();
	
	}

}
