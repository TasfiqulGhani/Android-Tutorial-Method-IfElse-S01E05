import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.print("Please enter a number");
		
		int numberone =sc.nextInt();
		
		System.out.print("Enter 2nd number");
		
		
		int numbertwo=sc.nextInt();
		
		System.out.print("Enter 1 for addition , enter 2 for sub , enter 3 for mult,enter 4 for div");
		int decition=sc.nextInt();  
		
		
		
		if(decition==1){
			int result=numberone+numbertwo;
			System.out.print(result);
			
		}else if(decition==2){
			
			int result=numberone-numbertwo;
			System.out.print(result);
		}else if(decition==3){
			
			int result=numberone*numbertwo;
			System.out.print(result);
		}else if(decition==4){
			
			int result=numberone/numbertwo;
			System.out.print(result);
		}else{
			System.out.print("Please enter a valid number");
		}
		
		

	}

}
