/**
*This program is the goat cabbbage fox problem
*@author Apurva Memani
*/
import java.util.Scanner;

public class GoatFoxCabbage
{
	public static boolean cabb;
	public static boolean fox;
	public static boolean goat;
	public static boolean human;
	
	public static void main(String[] args)
	{
		

		description();
		gameStatus();
		game();
	}
	public static void description()
	{
	/*
	*Description of game
	*/
		System.out.println("In this game the goal is to get all the items across the river");
		System.out.println("The fox, cabbbage, and goat. However, the fox cannot be left ");
		System.out.println("with the goat, and the goat cannot be left with the cabbbage");
		
		
	}
	public static void game()
	{
		
		while(gameplay())
		{
			gameStatus();
			
		}
		
	}
	
	
	
	
	
	public static void gameStatus()
	
	
	{
	
	/*
	*Prints the status of the game visually
	*/
		String bank0 = "	";
		String bank1 = "	";
		if (!cabb)
			bank0 += "C		";
		else
			bank1 += "C		";
		if(!goat)
			bank0 += "G		";
		else
			bank1 += "G		";
		if(!fox)
			bank0 += "F		";
		else
			bank1 += "F		";
		if(!human)
			bank0 += "H		";
		else
			bank1 += "H		";
			
		System.out.println(bank0);
		System.out.println("-------------------------------------------- \n\n\n");
		System.out.println("-------------------------------------------- ");
		System.out.println(bank1);
	}
	
	
	
	
	
	
	
	
	public static boolean gameplay()
	{
	/*
	*checks if you lost the game
	*Checks if you won game
	*Asks the user for the input of what he would like to move
	*@return boolean breaks or continues the while loop if you lose or continue playing
	*/
		Scanner keyboard = new Scanner(System.in);
		
		if(cabb == goat && cabb != human && goat !=fox)
		{
			System.out.println("You lose because the goat ate the cabbage...");
			return false;
		}
		if(goat == fox && fox != human && goat != cabb)
		{
			System.out.println("You lose because the fox ate the goat...");
			return false;
		}
		if(goat && fox && cabb)
		{
			System.out.println(" Wow you did it! Great Job!");
			return false;
		}
		System.out.print("What would you like to move across the river? ");
		String answer = keyboard.nextLine();
		change(answer);
		return true;
	}
	
	
	
	
	
	
	
	
	public static void change(String n)
	{
	/*
	*Switches the boolean value of the variables
	*checks so you cant move items without human
	*@param n takes in a user input to see what items he would like to move
	*/
		if (n.equals("H"))
			human = !human;
			
		else if(n.equals("C") && cabb == human)
		{
			cabb = !cabb;
			human = !human;
		}
		else if(n.equals("F") && fox == human)
		{
			fox = !fox;
			human = !human;
		}
		else if (n.equals("G") && goat == human)
		{
			goat = !goat;
			human = !human;
		}
		else{
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("You have to have the human on the same side of the item you would like to move.");	
			System.out.println("-----------------------------------------------------------------------------");
		}
	}
}
	
	
			
			
	
	