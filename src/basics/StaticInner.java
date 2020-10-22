package basics;

public class StaticInner {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("created " + t.getClass().getName());
		
		Test.TestInner testInner = t.new TestInner();
		System.out.println("created " + testInner.getClass().getName());
		
		t.test();
		
		Test.TestInnerPrivateStatic s = new Test.TestInnerPrivateStatic();
		System.out.println("created " + s.getClass().getName());
	}
}


class Test{
	public Test(){
		
	}
	
	public void test() {
		TestInnerPrivate t = new TestInnerPrivate();
		System.out.println("created " + t.getClass().getName());
	}
	
	public class TestInner{
		
	}
	
	private class TestInnerPrivate{
		
	}
	
	public static class TestInnerPrivateStatic{
		
	}
	
}
