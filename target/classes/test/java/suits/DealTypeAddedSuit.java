package suits;

import dealTypeAddedTests.DealTypeAddedWithPageObjectTest;
import dealTypeAddedTests.DealTypeAddedWithPageObjectWithoutName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                DealTypeAddedWithPageObjectTest.class,
                DealTypeAddedWithPageObjectWithoutName.class
        }
)

public class DealTypeAddedSuit {
}
