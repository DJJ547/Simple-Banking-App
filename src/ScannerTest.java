import java.util.Scanner;

public class ScannerTest {
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a number: ");
		//int a = scanner.nextInt();
		//System.out.println("value = " + a);
		
		System.out.println("Enter a character: ");
		char c = scanner.next().charAt(0); //always get the first character
		System.out.println("value = " + c);

}
