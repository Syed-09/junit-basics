package org.Example;

//To run tests from different files and packages, and in order

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
////To run tests from different classes and in order
//@SelectClasses({MathTest.class, ExampleTest.class}) //add square test and try

//To run tests from different packages and in order (give path or package name)
@SelectPackages({"org.Example"})

////To run tests with specific tag (Add @Tag before that specific method)
//@IncludeTags("Unit")
public class ExampleTestSuite {

}
