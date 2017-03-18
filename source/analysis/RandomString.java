package analysis;

public final class RandomString {
	
	// Strings characters
	private static final String BINARY_STRING = "01";
	
	/** 
	* get Generates a random string
	* @param size of the string
	* @return Resulting String
	*/
	public static String get(int size) {
		StringBuilder builder = new StringBuilder();
		while (size-- != 0) {
			// Random random integer between 0 and ALPHA_NUMERIC_STRING length
			int character = (int)(Math.random()*BINARY_STRING.length());
			// Append to resulting string
			builder.append(BINARY_STRING.charAt(character));
		}
		return builder.toString();
	}
}
