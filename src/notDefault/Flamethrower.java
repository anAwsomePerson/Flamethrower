package notDefault;

import java.util.Scanner;

public class Flamethrower {

	public static void main(String[] args) throws FlameException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Turn on flamethrower? (enter \"true\" or \"false\")");
        flamethrower(input.nextBoolean());
        System.out.println("okay.");
	}

	public static void flamethrower(boolean input) throws FlameException{
		if(input) {
			throw new FlameException();
		}
	}
}
