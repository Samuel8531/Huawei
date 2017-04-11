import java.util.Scanner;
import java.util.Arrays;
public class Run {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("===== WELCOME TO THE SEVILLANO's ======");
		System.out.println("Making reservations?");
		System.out.println("how many people?");
		int amount=in.nextInt();
		in.nextLine();
		System.out.println("Perfect");
		String[] name=new String[amount];
		for (int x=0;x<name.length;x++){
			System.out.println(" give me name "+(x+1));
			name[x]=in.nextLine();
		}
		Arrays.sort(name);
		System.out.println(" the top of the list is "+name[0]);
		System.out.println(" the middle person in your list is "+name[name.length/2]);
		System.out.println(" the last person in your list is "+name[name.length-1]);
	}

}
