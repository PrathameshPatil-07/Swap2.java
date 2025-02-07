import java.util.Scanner;
class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a 1st number");
		int a=sc.nextInt();
		System.out.print("Enter a 2nd number");
		int b=sc.nextInt();
		int temp=a;
		b=a;
		a=temp;
		System.out.println("a :"  + a);
				System.out.println("b :"  + b);
		}
		}
