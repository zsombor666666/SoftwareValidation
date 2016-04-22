
public class FakeFileExtentionManager implements FileExtentionManagerInterface{

	private boolean returnValue;
	
	@Override
	public void setReturnValue(boolean v) {
		returnValue=v;
	}
	
	@Override
	public boolean isValid(String s) {
		return returnValue;
	}


	
} 