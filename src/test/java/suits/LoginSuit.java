package suits;

import apparatAddedTests.ApparatAddedWithPageObjectTest;
import loginTests.LoginWithPageObjectTest;
import loginTests.LoginWithPageObjectWrongLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.ApparatAddedPage;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObjectTest.class,
                ApparatAddedWithPageObjectTest.class
        }
)
public class LoginSuit {
}
