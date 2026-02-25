import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestDate.class,
    TestInvoice.class,
    TestSalariedEmployee.class,
    TestCommissionEmployee.class,
    TestBasePlusCommissionEmployee.class,
    TestHourlyEmployee.class,
    TestPieceWorker.class
})
public class AllTests {
}
