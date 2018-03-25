package recursion4;

public class ReturnPermutations {

	public static void permuteString(String beginningString, String endingString) {
		if (endingString.length() <= 1)
			System.out.println(beginningString + endingString);
		else
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);

					permuteString(beginningString + endingString.charAt(i), newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
	}
	public static String[] permutations(String input)
	{
		permuteString("", input);
		String b[] =  new String[0];
		return b;
	}
	
	public static String[] permutationOfString(String input){
		String b[] = permutations(input);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
