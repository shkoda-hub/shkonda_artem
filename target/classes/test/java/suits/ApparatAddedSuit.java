package suits;

import apparatAddedTests.ApparatAddedWithPageObjectTest;
import apparatAddedTests.ApparatAddedWithPageObjectWithoutComment;
import apparatAddedTests.ApparatAddedWithPageObjectWithoutNumber;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ApparatAddedWithPageObjectTest.class,
                ApparatAddedWithPageObjectWithoutComment.class,
                ApparatAddedWithPageObjectWithoutNumber.class
        }
)

public class ApparatAddedSuit {
}
