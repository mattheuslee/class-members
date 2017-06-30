import package_a.DefaultTest;
import package_a.DefaultInheritedTest;

public class ClassMemberTest {
	
	public static void main() {
		DefaultTest.defaultMember = 42;
        DefaultInheritedTest.defaultMember = 42;
	}

}
