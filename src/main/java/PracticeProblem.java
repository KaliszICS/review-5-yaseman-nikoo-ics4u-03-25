import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num= in.nextDouble();
		in.nextLine();
		System.out.println(Math.abs(num));

		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1= in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2= in.nextDouble();
		in.nextLine();
		System.out.println(Math.floor(num1/num2));
		System.out.println(Math.ceil(num1/num2));

		
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num= in.nextDouble();
		in.nextLine();
		System.out.println(Math.round(Math.sqrt(num)));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1= in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2= in.nextDouble();
		in.nextLine();
		System.out.println(Math.pow(num1, num2));
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1= in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2= in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		double num3=in.nextDouble();
		in.nextLine();
		double numMax = Math.max(num1, num2);
		System.out.println(Math.max(numMax, num3));
		double numMin= Math.min(num1, num2);
		System.out.println(Math.min(numMin, num3));




		
	}
	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word= in.nextLine();
		System.out.println(word.contains("on"));
		
	}
	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String word = in.nextLine();
		System.out.println(word.equalsIgnoreCase("mango"));		
	}
	public static void q8() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.print("Input a letter: ");
		String letter = in.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
		
	}

	public static void q9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word = in.nextLine();
		System.out.println("Your sentence is "+ word.length()+ " characters long");
		
	}
	public static void q10() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		System.out.print("Input a word to replace: ");
		String word = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String wordReplace = in.nextLine();
		System.out.println(sentence.replaceAll(wordReplace, word));
	}

	public static void q11() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		System.out.println(sentence.toUpperCase().trim());
		System.out.println(sentence.toLowerCase().trim());
		
	}

	public static void q12() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.println(word.substring(0,4));
		System.out.println(word.substring(word.length()-4,word.length()));
	
		
	}
	

}
