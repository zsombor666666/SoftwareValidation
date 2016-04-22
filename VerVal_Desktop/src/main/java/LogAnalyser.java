
public class LogAnalyser {

	public boolean isValidLogFileName(String name){
		return getFileExtentionManager().isValid(name);
	}	

	public FileExtentionManagerInterface getFileExtentionManager() {
		return null;

	} 
}
