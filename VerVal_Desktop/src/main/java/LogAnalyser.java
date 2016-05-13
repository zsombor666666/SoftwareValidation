public class LogAnalyser {

	private WebService webService;
	private FileExtManager fileExtManager;
	
	public LogAnalyser() {
        this.fileExtManager = FileExtManagerFactory.getInstance().getFileExtManager();
    } 
	
    public void setWebService(WebService webService) {
        this.webService = webService;
    }
	
	public boolean isTheFileValid(String name){
//		if ( ( name != null) && (! name.isEmpty()) ) { 
//			if (name.length() < fileExtensionManager.getLogNameExt().length() + 2) {
//                throw new IllegalArgumentException("Name is to short.");
//            }
//            return name.endsWith("." + fileExtensionManager.getLogNameExt());
//        }
//		throw new IllegalArgumentException("Filename is empty or null");
//		}
		
		 if (webService != null && name.length() < 3) {
			 webService.logError(name + " too short");
	     }
	     return fileExtManager.isValid(name); 
	}	

	public FileExtManager getFileExtManager() {
		 return null;
	} 
}
