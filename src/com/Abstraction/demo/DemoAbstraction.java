package com.Abstraction.demo;
abstract class Bike
{
  public Bike()
   {
	  System.out.println("In side bike constructor"); 
   }
  abstract void run();
  public void ChangeGear()
  {
	  System.out.println("Gear changed");
  }

}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Inside honda calss");
		
	}
}
public class DemoAbstraction {

	public static void main(String[] args) {
           
		Honda h1=new Honda();
		h1.run();
		h1.ChangeGear();
	}

}
