package secondimplementation;

import java.util.Stack;

/**
 * BracketValidator is a class that takes care of validating
 * brackets in a given string
 *
 * Time complexity: O(N)
 * Space complexity: O(N)
 *
 * @author Waswa Olunga
 */

public class BracketValidator {

	private final Stack<Braces> stack;

	public BracketValidator() {
		stack = new Stack<>();
	}


	private boolean isValidBracketString (String bracketString){

		for (int i = 0; i < bracketString.length(); i++){

			Character character = bracketString.charAt(i);
			String characterAsString = character.toString();

			Braces.pushOpeningBrace(characterAsString, stack);

			Braces.popCorrectClosingBrace(characterAsString, stack);

		}

		return stack.isEmpty() && !bracketString.isEmpty();

	}


	public static void main (String[] args){

		BracketValidator validator = new BracketValidator();

		String bracketsOne = "{ Waswa [ is ] seriously ( dope ) dude }";
		String bracketsTwo = "{ [ ( ] ) }";
		String bracketsThree = "{ [ }";
		String bracketsFour = "}";
		String bracketsFive = " ";
		String bracketsSix = "{([)}]";
		String bracketsSeven = "][";

		if(validator.isValidBracketString(bracketsOne)){
			System.out.println("Braces in " + "\"" + bracketsOne + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsOne + "\" " +
							   "are incorrectly ordered.");
		}

		if(validator.isValidBracketString(bracketsTwo)){
			System.out.println("Braces in " + "\"" + bracketsTwo + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsTwo + "\" " +
							   "are incorrectly ordered.");
		}

		if(validator.isValidBracketString(bracketsThree)){
			System.out.println("Braces in " + "\"" + bracketsThree + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsThree + "\" " +
							   "are incorrectly ordered.");
		}

		if(validator.isValidBracketString(bracketsFour)){
			System.out.println("Braces in " + "\"" + bracketsFour + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsFour + "\" " +
							   "are incorrectly ordered.");
		}

		if(validator.isValidBracketString(bracketsFive)){
			System.out.println("Braces in " + "\"" + bracketsFive + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsFive + "\" " +
							   "are incorrectly ordered.");
		}

		if(validator.isValidBracketString(bracketsSix)){
			System.out.println("Braces in " + "\"" + bracketsSix + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsSix + "\" " +
							   "are incorrectly ordered.");
		}

		if(validator.isValidBracketString(bracketsSeven)){
			System.out.println("Braces in " + "\"" + bracketsSeven + "\" " +
							   "are correctly ordered.");
		} else {
			System.out.println("Braces in " + "\"" + bracketsSeven + "\" " +
							   "are incorrectly ordered.");
		}

	}

}
