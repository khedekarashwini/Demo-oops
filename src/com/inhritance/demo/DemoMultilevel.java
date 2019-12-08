package com.inhritance.demo;

class A
{
     public void methodA()
     {
    	 System.out.println("In method of A");
     }
}
class B extends A
{
    public void methodB()
    {
   	 System.out.println("In method of B");
    }

}
class C extends A
{
    public void methodC()
    {
   	 System.out.println("In method of C");
    }



}



public class DemoMultilevel {

	public static void main(String[] args) {
	          
       C c=new C();
        c.methodC();
      B b=new B();
        b.methodB();
       A a=new C();//It calls method of parent
       a.methodA();
      // C c=new A();  Not allowed
       
	}

}
