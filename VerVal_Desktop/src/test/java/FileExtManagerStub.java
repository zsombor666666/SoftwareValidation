
public class FileExtManagerStub implements FileExtManager {
	private boolean returnValue;
	public boolean isValid(String name) {
		return returnValue;
	}
	public void setReturnValue(boolean returnValue) {
		this.returnValue = returnValue;
	}
}
