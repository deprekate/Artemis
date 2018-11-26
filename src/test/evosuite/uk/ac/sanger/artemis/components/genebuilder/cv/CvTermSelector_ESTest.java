/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:28:21 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.cv.CvTermSelector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CvTermSelector_ESTest extends CvTermSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        CvTermSelector.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CvTermSelector cvTermSelector0 = null;
      try {
        cvTermSelector0 = new CvTermSelector();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }
}