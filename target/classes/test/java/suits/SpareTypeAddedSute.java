package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import spareTypeAddedTests.SpareTypeAddedWithPageObjectTest;
import spareTypeAddedTests.SpareTypeAddedWithPageObjectWithoutName;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                SpareTypeAddedWithPageObjectTest.class,
                SpareTypeAddedWithPageObjectWithoutName.class
        }
)
public class SpareTypeAddedSute {
}
