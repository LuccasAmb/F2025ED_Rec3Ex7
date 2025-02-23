package controller;

public class RecController {

	public RecController() {
		super();
	}
	
	public String Rec(String string, String gnirts) {
		
		if(string == "") {
			return gnirts;
		}else {
			gnirts+= string.substring(string.length()-1);
			return Rec(string.substring(0, (string.length() - 1)), gnirts);
		}
		
		
	}
	

	
}
