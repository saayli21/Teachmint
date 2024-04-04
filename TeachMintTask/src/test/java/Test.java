import java.io.IOException;

import org.automation.generic_utilities.Java_Utility;

public class Test {
	public static void main(String[] args) throws IOException {
		Java_Utility j=new Java_Utility();
		String otp=j.getdata("OTP");
		System.out.println(otp);
		for(int i=0;i<otp.length();i++) {
			String  s=Character.toString(otp.charAt(i));
			System.out.println(s);
		}
		
	}
}
