package SystemTest;

import org.testng.annotations.Test;

public class TestngExample3 {
	@Test
	  public void d() {
		  System.out.println("printing d");
	  }
	  @Test(groups="systemtest")
	  public void e() {
		  System.out.println("printing e");
	  }
	  @Test
	  public void f() {
		  System.out.println("printing f");
	  }
	  
}
