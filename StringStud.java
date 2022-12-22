// WAP take 2 String as Imput from uSer The user and find if both the Strings are same or not.

import java.io.*;
class StringStud
{
   public static void main(String args[])
   {
	   try
		 {
			  
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 String str1,str2;
			 System.out.println("Enter the First name: ");
			 str1=br.readLine();
			 System.out.println("Enter the Second name: ");
			 str2=br.readLine();
		 
			 System.out.println("First String :"+str1);
			 System.out.println("Second String:"+str2);
		 
		 if(str1.equals(str2) )
		 {
			 System.out.println("Both string are Same");
			 
		 }
		 else
		  {
			 System.out.println("Both string are different");
	      }
		 }
		 catch(Exception e)
			 {
			   System.out.println(e);
			 }
	  
    }
}
