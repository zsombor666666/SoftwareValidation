import org.junit.*;
import org.mockito.Mockito; 

public class LogAnalyserTest {

	private static final String validLogFileName = "Foo.slr";
    private static final String invalidLogFileName = "Bar.slrr";
    private LogAnalyser loganalyser;
    private FileExtManagerStub fileExtManager;
    private WebService webService; 
	
    @Before
    public void setUp() {
        fileExtManager = new FileExtManagerStub();
        FileExtManagerFactory.getInstance().setFileExtManager(fileExtManager);
        webService = new ManualWebService();
        loganalyser = new TestableLogAnalyser(fileExtManager);     
    }

    @After
    public void tearDown() {}

    @Test
    public void isValidLogFileName_ValidLogFileName_ReturnsTrue() {
        fileExtManager.setReturnValue(true);
        Assert.assertEquals(validLogFileName + " should be valid",
                loganalyser.isTheFileValid(validLogFileName), true);
    }

    @Test
    public void isValidLogFileName_InvalidLogFileName_ReturnsFalse() {
    	fileExtManager.setReturnValue(false);
        Assert.assertEquals(invalidLogFileName + " should be invalid",
                loganalyser.isTheFileValid(invalidLogFileName), false);

    }

    @Test
    public void IsValidLogFileNameTestable_NotValid_ReturnFalse() {
        fileExtManager.setReturnValue(false);
        Assert.assertEquals("should be invalid", 
        		loganalyser.isTheFileValid(""), false);
    }

    @Test
    public void IsValidLogFileNameTestable_Valid_ReturnTrue() {
    	fileExtManager.setReturnValue(true);
        Assert.assertEquals("should be valid", 
        		loganalyser.isTheFileValid(""), true);
    }

    @Test
    public void isValiedLogFileName_FileNameTooShort_CallsWebService() {
    	loganalyser.setWebService(webService);
        loganalyser.isTheFileValid("FO");
        Assert.assertEquals("should be too short", 
        		webService.getLastError(), "FO too short");
    }

    @Test
    public void isValiedLogFileNameMock_FileNameTooShort_CallsWebService() {
        WebService mockedWebService = Mockito.mock(WebService.class);
        loganalyser.setWebService(mockedWebService);
        loganalyser.isTheFileValid("FO");
        Mockito.verify(mockedWebService, Mockito.times(1)).logError("FO too short");
    } 
    
}
