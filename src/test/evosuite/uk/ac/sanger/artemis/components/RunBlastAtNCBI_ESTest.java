/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:43:02 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.RunBlastAtNCBI;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RunBlastAtNCBI_ESTest extends RunBlastAtNCBI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = RunBlastAtNCBI.constructRequest("GAPCOSTS", "GAPCOSTS", "GAPCOSTS", "l+x9@`EmzXyU5)Ae", "n{([XTA262M_TI8P!", "l+x9@`EmzXyU5)Ae", "GAPCOSTS", "'c85cyOY5-$", "n{([XTA262M_TI8P!");
      assertEquals("CMD=Put&QUERY=GAPCOSTS&DATABASE=GAPCOSTS&HITLIST_SIZE=l%2Bx9%40%60EmzXyU5%29Ae&FILTER=n%7B%28%5BXTA262M_TI8P%21&EXPECT=l%2Bx9%40%60EmzXyU5%29Ae&FORMAT_TYPE=HTML&PROGRAM=GAPCOSTS&CLIENT=web&SERVICE=GAPCOSTS&GAPCOSTS=%27c85cyOY5-%24+n%7B%28%5BXTA262M_TI8P%21", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RunBlastAtNCBI runBlastAtNCBI0 = new RunBlastAtNCBI("$q^+H");
      runBlastAtNCBI0.run();
      assertFalse(runBlastAtNCBI0.isInterrupted());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        RunBlastAtNCBI.setData((String) null, "B");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = RunBlastAtNCBI.constructRequest("", "", "", "", "", "", "megablast", "", "");
      assertEquals("CMD=Put&QUERY=&DATABASE=&HITLIST_SIZE=&FILTER=&EXPECT=&FORMAT_TYPE=HTML&PROGRAM=&CLIENT=web&SERVICE=megablast&MEGABLAST=yes", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        RunBlastAtNCBI.constructRequest((String) null, "iG2a]'0GKy+~J?(", "iG2a]'0GKy+~J?(", "iG2a]'0GKy+~J?(", (String) null, "iG2a]'0GKy+~J?(", (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        RunBlastAtNCBI.setData("blastn", "blastn");
      
      } catch(HeadlessException e) {
    	  	fail("caught HeadlessException");
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        RunBlastAtNCBI.setData("", "f:M?#6%Tf'PXV=q");
      
      } catch(HeadlessException e) {
    	  	fail("caught HeadlessException");
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = RunBlastAtNCBI.constructRequest("$q^+H", "11", "n.ae`3jzQU$Qamd:", "11", "$q^+H", "n.ae`3jzQU$Qamd:", "", (String) null, "k*4*");
      assertEquals("CMD=Put&QUERY=11&DATABASE=n.ae%603jzQU%24Qamd%3A&HITLIST_SIZE=11&FILTER=%24q%5E%2BH&EXPECT=n.ae%603jzQU%24Qamd%3A&FORMAT_TYPE=HTML&PROGRAM=%24q%5E%2BH&CLIENT=web&SERVICE=&GAPCOSTS=null+k*4*", string0);
  }
}