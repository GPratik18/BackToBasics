public class ExpressionSolver{


}








//Class represents 12 Digit number
class Number{
	final private long MAX_WHOLE_VALUE = 9999999999l;
	final private int MAX_DECIMAL_VALUE = 99;
	private long wholeValue;
	private int decimalValue;



	/**
	 * Constructor which strictly needs 12 digit string of numeric values.
	 */
	public Number(String value){
		int strlen = value.length();
		if(strlen!=12){
			wholeValue = 0;
			decimalValue = 0;
			return;
		}

		long num1 = Long.valueOf(value.substring(0,strlen-2));
		int num2 = Integer.valueOf(value.substring(10));
	}





	/**
	 * Add Number to this Number
	 */
	public void add(Number num){
		this.wholeValue = num.wholeValue + this.wholeValue;
		this.decimalValue = num.decimalValue + this.decimalValue;
		if(this.decimalValue>99){
			this.wholeValue ++;
			this.decimalValue /= 100;
		}

		if(this.wholeValue>MAX_WHOLE_VALUE){
			this.wholeValue = 0;
			this.decimalValue = 0;
		}
		


	}



	/**
	 * Converts a number to 12 digit string.
	 */
	static string numTo12DigitString(long wholeValue, int decimalValue){
		if(wholeValue>MAX_WHOLE_VALUE || decimalValue>MAX_DECIMAL_VALUE){
			return "000000000000";
		}
		StringBuilder str1 = new StringBuilder(String.valueOf(wholeValue));
		int len = str1.length();
		for(int i=0;i<10-len;i++){
			str1.insert(0, "0");
		}
		if(decimalValue<10){
			str1.append("0");
		}
		str1.append(String.valueOf(decimalValue));
		return str1.toString();
	}




	public String getValueInString(){
		return ""+wholeValue+"."+decimalValue;
	}

	public double getValue(){
		return wholeValue+(double)decimalValue/100;
	}




	public String getDecimalValueInString(){
		return String.valueOf(decimalValue);
	}

	public int getDecialValue(){
		return decimalValue;
	}

	public String getWholeValueInString(){
		return String.valueOf(wholeValue);
	}
	public long getWholeValue(){
		return wholeValue;
	}
	
}