import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		int rollCount = 0;
		int oddRollCount = 0;
		int evenCount = 0;
		int wins = 0;
		Scanner input = new Scanner (System.in);
		String guess;
		char guessChar;
		int roll;
		int count = 0;
		
		Dice dice = new Dice(rollCount);
		
		rollCount =  dice.HowMany();
		
		do
		{
			roll = dice.GetRoll(rollCount); 
			count ++;
			//System.out.print(roll);
			
			System.out.printf("You rolled a dice. Did the dice land on an odd or even number? 'O' for odd 'E' for even: ");
			guess = input.next();
			guessChar = guess.charAt(0);
			guessChar = Character.toUpperCase(guessChar);
			
			switch(guessChar)
			{
				case 'O':
				{
					if (roll % 2 == 0)
					{
						System.out.println("You guessed odd and the roll was even. Fail.");
					}
					else if (roll % 2 == 1)
					{
						System.out.println("You guessed odd and the roll was odd. Win.");
						wins++;
						oddRollCount++;
					}
					break;
				}
				case 'E':
				{
					if (roll % 2 == 0)
					{
						System.out.println("You guessed even and the roll was even. Win.");
						wins++;
						evenCount++;
					}
					else if (roll % 2 == 1)
					{
						System.out.println("You guessed even and the roll was odd. Fail.");
						evenCount++;
						oddRollCount++;
					}
					break;
				}
			}
		
		}while(count < rollCount);
		float percentOddRoll = (((float)oddRollCount) / ((float)count) * (100));
		float percentEven = (((float)evenCount)/((float)count)) * (100);
		float percentWin = (((float)wins)/((float)count)) * (100);
		System.out.printf("You played this game %d times!", count);
		System.out.printf("\nYou win %f percent of the time.", percentWin);
		System.out.printf("\nYou select even %f percent of the time.", percentEven);
		System.out.printf("\nYou roll an odd number %f percent of the time.", percentOddRoll);

	}

}
