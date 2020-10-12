/* StringProcessing.java
 * program inserts commas at specific position
 */

import acm.program.ConsoleProgram;

public class StringProcessing extends ConsoleProgram {
		
	public void run() {
		
		while (true) {
			String digits = readLine("Enter a number: ");
			if (digits.length() == 0 )break;
			println(addCommasToNumericString(digits));
		}
	}

	//method inserts commas, 
	private String addCommasToNumericString(String digits) {

		String commaInsert = "";

		int length = digits.length();
		int commaSeparater = 0;
		for(int i = length - 1; i >= 0; i--) {
			commaInsert = digits.charAt(i) + commaInsert;
			commaSeparater++;
			if (commaSeparater % 3 == 0 && commaSeparater < length) {
				commaInsert = "," + commaInsert;
			}

		}
		return commaInsert;
	}

}