public class BaseConversion {
	public static void main(String[] args) {
		String numBaseString = "615";
		int inputBase = 7;
		int outputBase = 13;
		String intString = convertBaseToDecimal(numBaseString, inputBase);
		System.out.println(numBaseString +" with base " + inputBase + " is " + intString);
		
		String result = convertDecimalToBase(Integer.parseInt(intString), outputBase);
		System.out.println(intString +" with base " + outputBase + " is " + result);
	}
	
	public static String convertBaseToDecimal(String numString, int inputBase) {
		boolean isNegative = numString.startsWith("-");
		int numInt = 0;
		int i = isNegative ? 1 : 0;
		// convert base7 to integer
		// use multiply and add
		for (; i < numString.length(); i++) {
			numInt *= inputBase;
			numInt += Character.isDigit(numString.charAt(i)) ? numString.charAt(i) - '0' : numString.charAt(i) - 'A' + 10;
		}
		
		return (isNegative ? "-" : "") + String.valueOf(numInt);
	}
	
	public static String convertDecimalToBase(int numInt, int outputBase) {
		// use division and modulus to convert decimal to base
		if (numInt == 0) {
			return "";
		}
		
		return convertDecimalToBase(numInt/outputBase, outputBase) +
		    (char)(numInt % outputBase >= 10 ? 'A' + numInt % outputBase - 10 : '0' + numInt % outputBase);
	}
}
