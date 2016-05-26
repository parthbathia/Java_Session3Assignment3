import java.io.*;
import java.util.*;

public class RandomNumber {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		RandomNumber rn = new RandomNumber();
		
		int num = Integer.parseInt(br.readLine());
		int ranNum = rn.generateRandom(num);
		
		System.out.println("The random number generated between 0 and " + num + " is " + ranNum + ".");
		
	}
	public int generateRandom(int num){
		
		Random r = new Random();
		return r.nextInt(num);
		
	}
	
}
