package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import providerAddedTests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ProviderAddedWithPageObjectTest.class,
                ProviderAddedWithPageObjectPrivatePerson.class,
                ProviderAddedWithPageObjectIsOurFirm.class,
                ProviderAddedWithPageObjectWithoutName.class,
                ProviderAddedWithPageObjectWithoutPhone.class,
                ProviderAddedWithPageObjectWithoutAddress.class
        }
)

public class ProviderAddedSuit {
}
