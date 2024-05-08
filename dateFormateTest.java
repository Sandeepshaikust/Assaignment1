package TestNgtestcases;

import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;


public class dateFormateTest {
  @Test
  public void testDateFormate() {
	  
	  utils.regExpMatcher rm = new  utils.regExpMatcher();
	  
	  Pattern p=Pattern.compile("[0-9]{1} [A-Z,a-z]{3} [0-9]{4}");
	  
	  boolean matched =rm.patternMatch("8 May 2024", p);
	  
	  Assert.assertEquals(true, matched);
  }
}
