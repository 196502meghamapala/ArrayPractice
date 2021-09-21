package string.man.gc.reddy;

import org.junit.Test;

public class StringPractice {
	//String is immutable class
	//constant pool (String literal)
	@Test
	public void abc() {
		String s = "hi";
		String s1 = "hi";
		System.out.println(s==s1);//true
		System.out.println(s.equals(s1));//true
		String s2 = new String("pen");
		String s3 = new String("pen");
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.compareTo(s3));//0(ZERO)
		String ss = new String("A");
		String ss1 = new String("a");
		System.out.println(ss.compareTo(ss1));//-(minus)
		String ssa = new String("b");
		String ssb = new String("B");
		System.out.println(ssa.compareTo(ssb));//+(plus)
		}
	
	@Test
	public void stringPractice() {
		String str = "This is the test string";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "      Space all around    ";
		String str6 = "Hello Hello hi";
		
		System.out.println("Ends with check 2:" + str.endsWith("test string"));
        System.out.println("Ends with check 2:" + str.endsWith("is"));
        System.out.println("Check contents are equal: " + str1.equals(str2));
        System.out.println("Check contents are equal: " + str1.equals(str3));
        System.out.println("Index of 'h' is: " + str.indexOf('h'));
        System.out.println("Check if string is empty 1: " + str.isEmpty());
        System.out.println("Check if string is empty 2: " + str4.isEmpty());
        System.out.println("Trim the leading and trailing spaces:" + str5.trim());
        System.out.println("Replace Example:" + str6.replace('e', 'a'));
        System.out.println("Substring Example 1:" + str.substring(5));
        System.out.println("Substring Example 2:" + str.substring(5, 10));
        
        String[] po= str.split(" ");
        System.out.println("==>"+po[4]);
        
        for(int i=0; i<po.length; i++) {
        	System.out.println("Split text : " + po[i]);
        }
        
        char charArray[] = str.toCharArray();
        int ww = charArray.length;
        for (int i = 0; i < ww; i++) {
        	System.out.println("Index " + i + "   is  :   " +charArray[i]);
        }
        
        System.out.println("Lower case: " + str.toLowerCase());
        System.out.println("Upper case: " + str.toUpperCase());

        }
	
}
