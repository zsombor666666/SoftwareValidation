
public class TestableLogAnalyser extends LogAnalyser {
    private FileExtManager fileExtManager;

    public TestableLogAnalyser(FileExtManager fileExtensionManager) {
        this.fileExtManager = fileExtensionManager;
    }

    @Override
    public FileExtManager getFileExtManager() {
        return fileExtManager;
    }
}
