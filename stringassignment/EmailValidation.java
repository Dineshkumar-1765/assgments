package stringassignment;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the email");
		
		String mail=sc.nextLine();

		if( checkMail(mail))
			System.out.println("valid email");
		else
			System.out.println("Email not valid");
		sc.close();
	  }
	
	public static boolean checkMail(String mail) {
		
	
		for(char c:mail.toCharArray()) {
			if(c>='A'&&c<='Z'||c==' '||c==','||c=='/'||c=='?'||c=='<'||c=='>' ||c=='['||c==']'||c=='{'||c=='}'||c=='('||c==')'||c=='!'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='~') {
				return false;
			}
		}
		
		if (mail==null||mail.length()<7) {
			return false;
		}
		int atCheck=mail.indexOf('@');
		int atCheck1=mail.lastIndexOf('@');
		
		if(atCheck==0||atCheck==mail.length()-1||atCheck!=atCheck1) {
			
		return false;
		}
		
		int dotCheck=mail.lastIndexOf('.');
		if(dotCheck==0||dotCheck==mail.length()-1)return false;
		
		
		
		String sub=mail.substring(atCheck+1);
		String subForwad= mail.substring(0,atCheck);
		
//		if(sub.length()<2||subForwad.length()<5||subForwad.contains("..")) {
//			return false;
//		}
		 if (sub.substring(dotCheck - atCheck).length() < 2 || subForwad.length() < 5 || subForwad.contains("..")) {
	            return false;
	        }
		return true;
		
		
		
		
		
		
	}

}
