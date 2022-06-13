package org.jsp.AccessModifiers;

public class Example1 
{
	  int myAge;
	    String myName;

	    //Default method
	    void defaultMethod() {
	        System.out.println("My name is " + myName + " and my age is " + myAge);
	    }
	

	
	public class DefaultClassFieldsMethod 
	{
	    public void main(String[] args)
	    {
	    	Example1 obj = new Example1();
	    	
	        //Accessing default fields
	        obj.myAge = 21;
	        obj.myName = "Sharan";
	        //calling default method
	        obj.defaultMethod();
	    }

}
}
