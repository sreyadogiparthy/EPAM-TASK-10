package EPAM.Task_10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class FindPalindromes {
	public static<T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			if(func.apply(t) != "0")
				result.add(func.apply(t));
		}
		return result;
}
 
public static String isPalindrome(String org) {
    String rev = "";
    int length = org.length();   
    for ( int i = length - 1; i >= 0; i-- )  
    	rev += org.charAt(i);  
    	if (org.equals(rev))  
        	return org;
      	else 
      		return "0";
}   
  
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    List<String> arr = new ArrayList<String>(n);
    for(int i = 0; i < n; i++) {
      	String z = sc.next();
      	arr.add(z);
    }
    sc.close();
    List<String> result = FindPalindromes.map(arr, FindPalindromes::isPalindrome);
    result.forEach(System.out::println);      
	}
}
