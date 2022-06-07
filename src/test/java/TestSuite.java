import com.googlecode.junittoolbox.SuiteClasses;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import sirius.kernel.ScenarioSuite;
import sirius.kernel.TestHelper;

/**
 *
 */
@RunWith(ScenarioSuite.class)
@SuiteClasses({"**/*Test.class"})
public class TestSuite {
    @BeforeAll
    public static void setUp() {
        TestHelper.setUp(TestSuite.class);
    }
    @AfterAll
    public static void tearDown() {
        TestHelper.tearDown(TestSuite.class);
    }
}