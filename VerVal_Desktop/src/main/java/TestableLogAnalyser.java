
public class TestableLogAnalyser extends LogAnalyser{

	private FileExtentionManagerInterface fexm;

	public TestableLogAnalyser(FileExtentionManagerInterface fem) {
		this.fexm=fem;
	}

	public FileExtentionManagerInterface getFileExtentionManager() {
		return fexm; 

	}
}
