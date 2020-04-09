package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import workersAddedTests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                WorkersAddedWithPageObjectTest.class,
                WorkersAddedWithPageObjectWithoutMiddleName.class,
                WorkersAddedWithPageObjectWithoutName.class,
                WorkersAddedWithPageObjectWithoutSurname.class,
                WorkersAddedWithPageObjectWithoutPhone.class
        }
)
public class WorkersAddedSuite {
}
