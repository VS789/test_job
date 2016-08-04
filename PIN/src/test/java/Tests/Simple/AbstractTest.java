package Tests.Simple;
import org.testng.annotations.*;

public abstract class AbstractTest {
    @BeforeClass(alwaysRun = true)
    public void setUp(){
        System.out.println("Test is started");
    }
    @AfterClass(alwaysRun = true)
    public void End(){
        System.out.println("Test is finished");
    }
}
