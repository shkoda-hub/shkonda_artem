package suits;

import apparatAddedTests.ApparatAddedWithPageObjectTest;
import loginTests.LoginWithPageObjectTest;
import loginTests.LoginWithPageObjectUpperLogin;
import loginTests.LoginWithPageObjectWrongLogin;
import loginTests.LoginWithPageObjectWrongPassword;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.ApparatAddedPage;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObjectTest.class,
                LoginWithPageObjectUpperLogin.class,
                LoginWithPageObjectWrongLogin.class,
                LoginWithPageObjectWrongPassword.class
        }
)
public class LoginSuit {
}
