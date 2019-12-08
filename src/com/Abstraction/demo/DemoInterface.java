package com.Abstraction.demo;
interface Printable
{
	void print();
	void testprintable();
}
interface Showable
{
  void print();
  void testshowable();
}

class Test implements Printable,Showable
{
     public void print()
     {
    	 System.out.println("Hello");
     }
  
     
     public void testprintable()
     {
    	 System.out.println("In side printable");
     }
     public void testshowable()
     {
    	 System.out.println("In side showable");
     }
}
public class DemoInterface {

	public static void main(String[] args) {
		
   Test t=new Test();
   t.print();
   t.testprintable();
   t.testshowable();
		   
	}

}
