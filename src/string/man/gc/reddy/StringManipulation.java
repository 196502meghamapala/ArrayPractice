package string.man.gc.reddy;

import org.junit.Test;

public class StringManipulation {
	
	@Test
	public void stringManipulation() {
		
		String str = "The rains have started here";
		
		System.out.println(str.length()+" "+str.charAt(5)+" "+str.indexOf('s'));
		
		int bb=str.length();
		char kk=str.charAt(10);
		int ll=str.indexOf('d');
		System.out.println(bb+" "+kk+" "+ll);
		
		//how to divided a String
		String mm[]=str.split(" ");
		for (int i =0; i<mm.length; i++) {
			System.out.println("------->"+mm[i]);
			}
		
		//how to divided a String
		String str1="Game of Throne";
		String dd[]=str1.split(" ");
		for (int i =0; i<dd.length; i++) {
			System.out.println("=========>"+dd[i]);
		}
		
		//how to divided a String
		String str2="How are you";
		String vv[]=str2.split(" ");
		for (int i =0; i<vv.length; i++) {
			System.out.println(vv[i]+"<======");
		}
		
		//how to divided a string
		String str5="welcome here !";
		String array[]=str5.split(" ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+"<==");
		}
		
		//How to find substring from a String(substring is part of a string)
		int l=str5.indexOf("ere !");
		System.out.println(l);
		
		String s=str5.substring(9, 14);
		System.out.println(s);
		
		//Length of String
		char[] d=str5.toCharArray();
		int length=d.length;
		System.out.println("String length-->"+length);
		
		//Reverse a String using logic
		for(int i=length-1; i>=0; i--)
		{
			System.out.println(d[i]);
		}
		
		//Reverse a String using logic
		String reverseWord = "";
		for(int i=length-1; i>=0; i--)
		{
			reverseWord = reverseWord + str5.charAt(i);
		}
		System.out.println(reverseWord);
		
		//Reverse a String using Built in Method
		StringBuffer stringbuffer=new StringBuffer(str5);
		System.out.println(stringbuffer.reverse());
		
		//Reverse a String using Built in Method
		StringBuilder stringbuilder=new StringBuilder(str5);
		System.out.println(stringbuilder.reverse());
		
		//How to Reverse a sentence based on word
		//Example : "How are you" as "you are How"
		
		String sentence = "How are you";
		String word[]=sentence.split(" ");
		StringBuffer reverseWord2=new StringBuffer();
		for(int i=word.length-1; i>=0; i--)
		{
			reverseWord2.append(word[i]).append(" ");
		}System.out.println(reverseWord2);
		
		//Remove all spaces between words
		String str7="How Are You";
		String str8=str7.replace(" ", "");
		System.out.println(str8);
		
		//CompareTo() method : THREE WAY COMPARISON
		String str10="HOW";
		String str11="how";
		int xx=str10.compareTo(str11);//(-)less than
		System.out.println(xx);
		
		//CompareTo() method : THREE WAY COMPARISON
		int cd=str11.compareTo(str10);//(+)more than
		System.out.println(cd);
		
		//CompareTo() method : THREE WAY COMPARISON
		String str12="HOW";
		int vc=str12.compareTo(str10);
		System.out.println(vc);//(0) ZERO equal
		
		//equals method TWO WAY COMPARISON TRUE OR FALSE
		boolean ff=str10.equals(str12);
		System.out.println(ff);//true
		
		//equals method TWO WAY COMPARISON TRUE OR FALSE
        boolean fg=str10.equals(str11);
		System.out.println(fg);//false
		
		//==(DOUBLE EQUAL)method TWO WAY COMPARISON TRUE OR FALSE
		boolean fp=str10==str12;
		System.out.println(fp);//true
		
		//==(DOUBLE EQUAL)method TWO WAY COMPARISON TRUE OR FALSE
		boolean pp=str10==str11;
		System.out.println(pp);//false
		
		//BASED ON LAST METOD RETURN TYPE DECIDE EX; INT S5="HELLO".hashCode();

	}

}
