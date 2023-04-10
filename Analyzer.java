import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Analyzer {
	//compute polynomial hash code according to page 413 in our book
	//Use horner's method 
	public static int hashCode(int a, String x) {
		int n = x.length();
		int a_power = a;
		int hash = x.charAt(n-1);
		System.out.println((int)x.charAt(n-1));
		for(int i=n-2; i>=0; i--){
			System.out.print(" + " + a_power + " * " + (int)x.charAt(i));
			hash += x.charAt(i) * a_power;
			a_power = a_power * a;
		}
		System.out.println(" = h(" + a + ", " + x + ") =" +hash);
		return hash;
		}
    
	
	
	
	public static void main(String[] args) {
		hashCode(2, "stop");
		hashCode(3, "stop");
		hashCode(2, "pots");
		hashCode(1, "stop");
		hashCode(1, "pots");
		hashCode(1, "tops");

}
}
