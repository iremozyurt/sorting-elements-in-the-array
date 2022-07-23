import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner =new Scanner (System.in);
		
		System.out.println("Enter the size of the array");
		int boyut=scanner.nextInt();
		
		int [] arr=new int[boyut];
		
		System.out.println("enter the elements of the array:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			System.out.print((i+1)+ ". elements");
			
		}
		System.out.print("The entered array   :");
        System.out.println("The sorting :"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("The entered array    :");
        System.out.println("The sorting:"+Arrays.toString(arr));
		
	}

}
