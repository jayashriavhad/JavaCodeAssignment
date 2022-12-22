//WAP create 2 interfaces "Printable" and "Calculate" and use these 2 interfaces in 2 classes one will calculate square and another will calculate cube.

import java.io.*;
interface Printable
{
	void displaySC();
}
interface Calculate
{
	int cal(int n);
}
class Square implements Printable, Calculate
{
	public void displaySC() 
	{
		System.out.println("Square of a number is : ");
	}
	public int cal(int n)
	{
		return n*n;
	}
}
class Cube
{
	public void displaySC() 
	{
		System.out.println("Cube of a number is : ");
	}
	public int cal(int n)
	{
		return n*n*n;
	}
}


public class  UsePrintCal
{

	public static void main(String[] args) 
	{
		Square sq = new Square();
		sq.displaySC();
		System.out.println(sq.cal(2));
		
		Cube c = new Cube();
		c.displaySC();
		System.out.println(c.cal(2));
	}

}