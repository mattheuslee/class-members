package package_b;

import package_a.DefaultTest;

public class DefaultNonPackageInheritedTest extends DefaultTest {
    public DefaultNonPackageInheritedTest() {
        defaultMember = 42;
    }
}