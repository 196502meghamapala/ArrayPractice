package string.man.gc.reddy;

import org.junit.Test;

public class Class1 {
	
	//What is String ?
	//String is a sequence of characters written in double quotes.
	//String may have Alfa bytes, numbers and special characters.
    //Creating String :
	//For example like VB Script String is just variable
	//But in Java String is Object.
	
	@Test
	public void stringExplain() {
		
	String myTool = "Selenium";//String Variable
	
	String [] myTools = {"UFT", "Selenium", "RFT"};//Array of Strings
	
	System.out.println(myTool);//Selenium
	
	for(String tools: myTools) {
		System.out.println(tools);
	}
	//Usually String is Object in Java we can use as data-type also
	
	//Concatenating String
	String str1="Selenium";
	String str2=" Testing";
	System.out.println(str1+str2);//Selenium Testing
	
	//You can concatenate directly without storing
	System.out.println("Selenium"+" Testing");//Selenium Testing
	
	//Generating evaluate operator is left to right
	System.out.println("Selenium"+1+1);//Selenium11
	
	//number+number=add
	//String+number=concatenate
	//String+String=concatenate
	System.out.println(1+1+"Selenum");//2Selenium
	
	//String Comparison : 
	//Using comparison == operator ==> TwoWay comparison (true/false)
	//Using equals() method     ==> TwoWay comparison (true/false)
	//Using CompareTo() method  ==> ThreeWay comparison (equals/greater than/less than)
	//Do you have 100 yes or no => two way comparison
	//Do you have 100  yes means equal to  =>Three way comparison (==, >, <)
	//                 Greater than 100    =>I have more than 100 
	//                 Less than 100       =>I have less than 100
	
	// If String1 == String2 then 0  (Zero is constant / built in)
	// If String1  > String2 then >0 (Positive Value)
	// If String1  < String2 then <0 (Negative Value)
	
	String str3 = "SELENIUM";
	String str4 = "selenium";
	String str5 = "SELENIUM";
	String str6 = "zselenium";
	
	//String comparison happen based on ANSI character codes
	//ANSI=American National Standed Institution
	//Any programiming language ANSI codes are same.
	//A to Z (65 to 90), a to z (97 to 122), number 0 to 9 (48 to 57)
	
	//String comparison using relational operator ==
	System.out.println(str3==str4); //false
	System.out.println(str3==str5); //true
	
	//String comparison using equals() method
	System.out.println(str3.equals(str4));//false
	System.out.println(str3.equals(str5));//true
	
	//String comparison using compareto() method
	System.out.println(str3.compareTo(str5));//0 (Zero)
	System.out.println(str4.compareTo(str3));//+ (Positive Value)
	System.out.println(str3.compareTo(str6));//- (Negative Value)

		

	
	
	
	
	}	
	
}
