package suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({ClassATest.class, ClassBTest.class, ClassCTest.class}) // all test of the class will execute
@SelectPackages("Controller") //all test classes in the package will run
public class TestSuite {
}
