// Graded lab StringBuffer
// Adam Plesca
// 14/4/23

public class FirstLast{

	private String input, output;

	StringBuffer strBuff = new StringBuffer();

	public FirstLast(){
	input = " ";
	output = " ";
	}
	public void setInput(String input){
		this.input = input;
	}
	public void compute(){
		strBuff.append(input.charAt(input.length()-1));
		for(int i = 1; i < input.length()-1; i++){ //this gets second last letter to last
			strBuff.append(input.charAt(i));
			}
		strBuff.append(input.charAt(0));
		output = strBuff.toString();

	}
	public String getOutput(){
		return output;
	}

}