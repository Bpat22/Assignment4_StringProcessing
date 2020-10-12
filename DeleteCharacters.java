/* DeleteCharacter.Java
 * program uses CharAt to remove characters from string
 */

import acm.program.ConsoleProgram;

public class DeleteCharacters extends ConsoleProgram{

	private int i;

	public void run() {
		//this are example which will return string without character 
		
		println(removeAllOccurences("This is a test", 't'));
		println(removeAllOccurences("Summer is here!", 'e')) ;
		println(removeAllOccurences("---0---", '-')) ;
		
	}
	
	private String removeAllOccurences(String str, char ch) {

		String removeChar = "";
		for (int i = 0; i < str.length(); i++);
			if (str.charAt(i) != ch) {
				removeChar += str.charAt(i);
			}
			return removeChar;
	}
	
}

