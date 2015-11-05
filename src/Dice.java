import java.util.Scanner;
public class Dice {
	
	private int number;
	
	public Dice (int number)
	{
		this.number = number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public int getInt()
	{
		return number;
	}
	
	public int HowMany()
	{
		Scanner input = new Scanner(System.in);
		int numberOfRolls = 0;
		System.out.print("Enter ammount of dice rolls:\n"
				+ "Also how many sides the die has (x)*6 (you enter x)  ");
		numberOfRolls = input.nextInt();
		return numberOfRolls;
	}
	
	public int GetRoll(int rolls)
	{
		int range = (rolls *(6 - 1)) + 1;     
		return (int)(Math.random() * range) + 1;
	}
}
