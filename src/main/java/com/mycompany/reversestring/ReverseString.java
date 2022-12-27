package com.mycompany.reversestring;
import java.util.Scanner;

/**
 *
 * @author melihsafakdal
 */
public class ReverseString {

    public static void main(String[] args) {
       
        
       	Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here

		for(int x = arr.length - 1 ; x >= 0 ; x--){

			System.out.println(arr[x]);

	} 
    }
}
