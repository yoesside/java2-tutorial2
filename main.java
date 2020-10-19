import java.util.*;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ssr = new Scanner(System.in);
		
				
		System.out.println("Welcome to book application!");
		
		System.out.print("Please input the room name: ");
		String name = ssr.nextLine();
		
		System.out.print("You sure to book(y/n)? ");
		String books = ssr.nextLine();
		
		switch(books) {
		case "y":
			books = true;
			break;
		
		case "n":
			books = false;
			break;
		
		default:
			System.out.print("Null");
		}
		
		System.out.print("insert length: ");
		int length = ssr.nextInt();
		
		System.out.print("insert widht: ");
		int width = ssr.nextInt();
		
		System.out.print("Showing length "+ length + " and width "+ width);
			

		

	}

}
