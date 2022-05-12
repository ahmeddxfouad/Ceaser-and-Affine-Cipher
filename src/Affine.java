import java.util.Scanner;
public class Affine 
{
	public static String encryptionMessage(String Msg,int a,int b)
    {
        String CTxt = "";
        
        for (int i = 0; i < Msg.length(); i++)
        {
            CTxt = CTxt + (char) ((((a * Msg.charAt(i)) + b) % 26) + 65);
        }
        return CTxt;
    }
 
    public static String decryptionMessage(String CTxt,int a,int b)
    {
        String Msg = "";
        
        int a_inv = 0;
        int flag = 0;
        for (int i = 0; i < 26; i++)
        {
            flag = (a * i) % 26;
            if (flag == 1)
            {
                a_inv = i;
                System.out.println(i);
            }
        }
        for (int i = 0; i < CTxt.length(); i++)
        {
            Msg = Msg + (char) (((a_inv * ((CTxt.charAt(i) - b)) % 26)) + 65);
        }
        return Msg;
    }
 
    public static void main(String[] args)
    {
    	int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message" );
        String message = sc.next();
        System.out.println("Enter a" );
        a=sc.nextInt();
        System.out.println("Enter b" );
        b=sc.nextInt();
        System.out.println("Message is :" + message);
        System.out.println("Encrypted Message is : "
                + encryptionMessage(message,a,b));
        System.out.println("Decrypted Message is: "
                + decryptionMessage(message,a,b));
        sc.close();
    }
	
	

}
