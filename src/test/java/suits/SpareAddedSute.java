package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import spareAddedTest.SpareAddedWithPageObjectTest;
import spareAddedTest.SpareAddedWithPageObjectWithoutName;
import spareAddedTest.SpareAddedWithPageObjectWithoutSpareType;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                SpareAddedWithPageObjectTest.class,
                SpareAddedWithPageObjectWithoutName.class,
                SpareAddedWithPageObjectWithoutSpareType.class
        }
)
public class SpareAddedSute {
}
