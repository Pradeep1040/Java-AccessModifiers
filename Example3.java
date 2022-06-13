package org.jsp.AccessModifiers;

public class Example3
{
	 protected String name;

	    //Protected method
	    protected void protectedMethod() {
	        System.out.println("This is a " + name);
	    }
	}

	//Accessing protected fields and methods from other class in the same package
	class protectedClass_03 {
	    public static void main(String[] args) {
	       
	    	Example3 e1 = new Example3();
	    
	        e1.name = "Protected Method";
	        
	        e1.protectedMethod();
	    }

}
