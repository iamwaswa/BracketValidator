package firstimplementation;

import java.util.Stack;

/**
 * FirstImplementation is a class that takes care of validating
 * brackets in a given string
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

public class FirstImplementation {

	private static Stack<Braces> stack = new Stack<>();


	public enum Braces {

		OPENING_CURLY_BRACE("{"),
		OPENING_SQUARE_BRACKET("["),
		OPENING_PARENTHESES("("),
		CLOSING_CURLY_BRACE("}"),
		CLOSING_SQUARE_BRACKET("]"),
		CLOSING_PARENTHESES(")");

		private String braceAsString;


		Braces(String braceAsString) {
			this.braceAsString = braceAsString;
		}


		public String getBraceAsString() {
			return braceAsString;
		}


		public static void pushOpeningBrace(String brace){

			if(OPENING_CURLY_BRACE.getBraceAsString().equals(brace)){
				stack.push(OPENING_CURLY_BRACE);
			}

			if (OPENING_SQUARE_BRACKET.getBraceAsString().equals(brace)){
				stack.push(OPENING_SQUARE_BRACKET);
			}

			if (OPENING_PARENTHESES.getBraceAsString().equals(brace)){
				stack.push(OPENING_PARENTHESES);
			}

		}


		public static void popCorrectClosingBrace(String brace){

			if(CLOSING_CURLY_BRACE.getBraceAsString().equals(brace)){
				if(stack.peek() == OPENING_CURLY_BRACE){
					stack.pop();
				}
			}

			if (CLOSING_SQUARE_BRACKET.getBraceAsString().equals(brace)){
				if(stack.peek() == OPENING_SQUARE_BRACKET) {
					stack.pop();
				}
			}

			if (CLOSING_PARENTHESES.getBraceAsString().equals(brace)){
				if(stack.peek() == OPENING_PARENTHESES) {
					stack.pop();
				}
			}

		}
	}

	public static void main (String[] args){

		String bracketsOne = "{ Waswa [ is ] seriously ( dope ) dude }";
		String bracketsTwo = "{ [ ( ] ) }";
		String bracketsThree = "{ [ }";
		String bracketsFour = "";
		String bracketsFive = " ";

		if(isValidBracketString(bracketsOne)){
			System.out.println("Braces in " + "\"" + bracketsOne + "\"" +
							  " are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsOne + "\"" +
							  " are incorrectly ordered.");
		}

		if(isValidBracketString(bracketsTwo)){
			System.out.println("Braces in " + "\"" + bracketsTwo + "\"" +
							  " are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsTwo + "\"" +
							  " are incorrectly ordered.");
		}

		if(isValidBracketString(bracketsThree)){
			System.out.println("Braces in " + "\"" + bracketsThree + "\"" +
							  " are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsThree + "\"" +
							  " are incorrectly ordered.");
		}

		if(isValidBracketString(bracketsFour)){
			System.out.println("Braces in " + "\"" + bracketsFour + "\"" +
							  " are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsFour + "\"" +
							  " are incorrectly ordered.");
		}

		if(isValidBracketString(bracketsFive)){
			System.out.println("Braces in " + "\"" + bracketsFive + "\"" +
							  " are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsFive + "\"" +
							  " are incorrectly ordered.");
		}

	}


	private static boolean isValidBracketString (String bracketString){

		if (bracketString.isEmpty()){
			return false;
		}

		for (int i = 0; i < bracketString.length(); i++){

			Character character = bracketString.charAt(i);
			String characterAsString = character.toString();

			Braces.pushOpeningBrace(characterAsString);

			Braces.popCorrectClosingBrace(characterAsString);

		}

		return stack.isEmpty();

	}

}
