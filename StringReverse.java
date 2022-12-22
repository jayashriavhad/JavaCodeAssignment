//TAke a String from user and reverse it and also convert the same String to uppercase.

import java.io.*;
class StringReverse
{
  public static void main(String args[])
  {
  try
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String a;
   System.out.println("Enter The String");
   a=br.readLine();
   String rev="";
   for(int i=a.length()-1;i>=0;i--)
   {
	   rev=rev+a.charAt(i);
   }
   System.out.println(rev.toUpperCase());
  
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
  }
}