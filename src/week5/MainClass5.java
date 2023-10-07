package week5;

import java.util.Scanner;
/*
 * @author Clarence Juanata
 * Student_ID 4537982
 * Faculty Sumithra
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		PolySampleClass polymorph = new PolySampleClass();
		
		
		String fruits[] = {"apple", "banana", "orange"};
		
		for(int i=0; i< fruits.length; i++) {
			System.out.println(fruits[i].substring(0,1).toUpperCase() + fruits[i].substring(1).toLowerCase());
		}
		
		System.out.println("\nLast item: " + fruits[fruits.length-1] + "\n");
		
		String fruitsCollections[] = new String[5];
		
		for(int i=0; i<fruitsCollections.length; i++) {
			System.out.print("Enter fruit: ");
			fruitsCollections[i] = scan.next();
		}
		
		System.out.println("The last element entered was: " + fruitsCollections[fruitsCollections.length-1]);
		
		
		System.out.printf("\nThe sum from 1 to 10 is %d ",RangeNumberClass.sumof1To10());
		System.out.printf("\nThe sum from 20 to 30 is %d",RangeNumberClass.sumof20To30());
		System.out.printf("\nThe sum from 35 to 45 is %d ",RangeNumberClass.sumof35To45());
	
		polymorph.product(10);
		PolySampleClass.product();
		System.out.println("The product: "+polymorph.product(15, 5));
	
	}
	
	

}
