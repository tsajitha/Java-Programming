import java.util.*;
import java.lang.*;
import java.io.*;
class Compare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1=null;
		String str2=null;
		
		Scanner SC=new Scanner(System.in);
		
		System.out.print("Enter string1: ");
		str1=SC.nextLine();

		System.out.print("Enter string2: ");
		str2=SC.nextLine();		
		
		//compare strings
		if(str1.length()!=str2.length()){
			System.out.println("Strings are not same, lengths are different!!!");
			return;
		}
		
		boolean flg=true;
		for(int loop=0; loop<str1.length();loop++){
			if(str1.charAt(loop)!=str2.charAt(loop)){
				flg=false;
				break;
			}
		}
		
		if(flg){
			System.out.println("Strings are same.");
		}
		else{
			System.out.println("Strings are not same.");
		}
		 
	}
}
