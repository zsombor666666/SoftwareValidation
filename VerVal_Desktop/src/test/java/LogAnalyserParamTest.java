import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized; 

public class LogAnalyserParamTest {
	private LogAnalyser logAnalyser;
    private FileExtManagerStub fileExtManager;

    @Parameterized.Parameter
    public String input;

    @Parameterized.Parameter(value = 1)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Foo.slr", true }, { "Bar.slrr", false }
        });
    }
    
    @Before
    public void setUp() {
        fileExtManager = new FileExtManagerStub();
        logAnalyser = new LogAnalyser();
    }


    @Test
    public void test() {
        fileExtManager.setReturnValue(expected);
        Assert.assertEquals(expected, logAnalyser.isTheFileValid(input));
    } 

}
