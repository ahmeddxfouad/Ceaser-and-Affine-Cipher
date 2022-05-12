import java.util.Scanner;
 
public class Ceaser {
	
	public static void main (String [] args){
		
		    Scanner x = new Scanner(System.in);
		 System.out.println("1-  Encode ");
		 System.out.println("2-  Decode ");
	 System.out.print("Choose ");
		 int choice = x.nextInt();
		 x.nextLine();
		 if (choice == 1){
		 System.out.println("Enter the text you want to encode?");
		String input = x.nextLine();
		System.out.print("What is the key: "); 
		int key = x.nextInt();
		
		 String encoded = "";
		
		        for(int i=0;i<input.length();i++){

		            char c = input.charAt(i);
		
		            char e = '?';
		
		            if(c == ' '){
		
		                e = ' ';
		
		            }
		            else if (c >= 'a' && c <= 'z')
		            {
		
		                e = (char)((int) c + key);
		
		            }
		            while(e > 'z'){

		                e = (char)((int)e - 26);
		
		            }
		
		         
		
		        encoded = encoded + e;
		
		        System.out.println(encoded);

		         
		
		        }
		
		   }
		
		     else if (choice == 2)
		     {
		
		        System.out.println("Enter the text you wish to decode?");
		
		        String input = x.nextLine();
		
		        System.out.print("Enter the key: "); 
	
		        int key = x.nextInt();
		
		         String decoded = "";
		
		        for(int i=0;i<input.length();i++){
		
		            char c = input.charAt(i);
		
		            char e = '?';
		
		            if(c == ' '){
		
		                e = ' ';
		
		            }else if (c >= 'a' && c <= 'z'){
		
		                e = (char)((int) c - key);
		
		            }while (e < 'z'){
		
		                e = (char)((int)e + 26);
		
		            }
		
		         
		
		        decoded = decoded + e;
		
		        System.out.println(decoded);
		
		         
		
		        }
		
		     }
		
		    else{
		
		    System.out.println("Try again");
	
		    }
		}
}



	
	
	
	
	


