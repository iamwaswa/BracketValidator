package secondimplementation;

import java.util.Stack;

/**
 * The Braces enum describes all the
 * fields and methods that deal with
 * configuring the correct order of
 * braces in a given input
 *
 * @author Waswa Olunga
 */

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


	public static void pushOpeningBrace(String brace, Stack<Braces> stack){

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


	public static void popCorrectClosingBrace(String brace, Stack<Braces> stack){

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
