
public class LogAnalyzer {

	public Boolean IsValidLogFileName(String s){
		if (s.substring(s.length()-4).matches(".slr")){
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		if (new LogAnalyzer().IsValidLogFileName("asdf.slgr"))
			System.out.println("Valid File");
		else System.out.println("Invalid File");
	}

}
