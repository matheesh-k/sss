import java.util.*;
public class reversing_string_place {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		Scanner out=new Scanner(System.in);
		String mai=out.nextLine();
		char car[]= mai.toCharArray();
		System.out.println("the reversed string:");
		for(int j=car.length-1;j>=0;j--){
			System.out.print(car[j]);
			
		}
		// TODO Auto-generated method stub
	}

	}


