package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			char [] c = s.toCharArray();
			for (int i = 0; i < c.length/2; i++) {
				char temp = c[i];
				c[i] = c[c.length-i-1];
				c[c.length-i-1] = temp;
			}
			System.out.println(String.valueOf(c));
		}, "repeat");

		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			char [ ] c = s.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				if(i%2 == 0){
					c[i] -= 32;
				}
			}
			System.out.println(String.valueOf(c));
		}, "repeat");

		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			char [] c = new char[s.length()*2];
			for (int i = 0; i < c.length; i++) {
				c[i] = '.';
			}
			for (int i = 0; i < s.length(); i++) {
				c[i*2] =  s.charAt(i);
			}
			System.out.println(String.valueOf(c));
		}, "repeat");

		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char [] c = s.toCharArray();
			String result = "";
			for (int i = 0; i < c.length; i++) {
				if(!(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')){
					result = result.concat(String.valueOf(c[i]));
				}
			}
			System.out.println(String.valueOf(result));
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
