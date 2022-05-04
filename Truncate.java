import java.util.Scanner;

class Truncate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter input: ");
		double number = input.nextDouble();
		
		int whole = (int) number;
		double decimal = number - whole;
		
		if (decimal >= 0.00 && decimal < 0.25) decimal = 0.00;
		if (decimal >= 0.25 && decimal < 0.50) decimal = 0.25;
		if (decimal >= 0.50 && decimal < 0.75) decimal = 0.50;
		if (decimal >= 0.75 && decimal < 0.99) decimal = 0.75;
		
		double result = (whole + decimal);
		System.out.println(result);
		
	}
}
