
public class ManualWebService implements WebService{
	private String lastError;
    public void logError(String error) {lastError = error;}
    public String getLastError() {return lastError;} 
}