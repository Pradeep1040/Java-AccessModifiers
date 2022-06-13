package org.jsp.AccessModifiers;

public class Example2 
{
	
		  private static String name = "Sharan";
		    private  static int age = 21;

		    //private method
		    private  static void  privatemethod() 
		    {
		        System.out.println("My Name is " + name + " and my age is " + age);
		    }

		    //main method
		    public static void main(String[] args)
		    {
		    	Example2 obj = new Example2();
		        //Printing the fields in main method
		        System.out.println(obj.age);
		        System.out.println(obj.name);
		        //Calling the private method in main method
		     
		    }
		    
		
	}


