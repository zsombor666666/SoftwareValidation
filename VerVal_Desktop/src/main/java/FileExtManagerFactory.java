
public class FileExtManagerFactory {
	private static FileExtManagerFactory INSTANCE;
	private FileExtManager fileExtManager;
	private FileExtManagerFactory(){}
	private FileExtManagerFactory(FileExtManager fileManager){
		this.fileExtManager = fileManager;
	}

	public static FileExtManagerFactory getInstance(){
		if(INSTANCE == null)
			INSTANCE = new FileExtManagerFactory();
		return INSTANCE;
	}
	public FileExtManager getFileExtManager(){
		//return INSTANCE.getFileManager();
		if (fileExtManager != null) return fileExtManager;
		else return new FakeFileExtManager();
	}

	public void setFileExtManager(FileExtManager fileExtManager){
		this.fileExtManager = fileExtManager;
	}
} 
