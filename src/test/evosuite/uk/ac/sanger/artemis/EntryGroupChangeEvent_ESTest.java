/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:34:02 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.EntryGroupChangeEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EntryGroupChangeEvent_ESTest extends EntryGroupChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      Entry entry0 = mock(Entry.class, new ViolatedAssumptionAnswer());
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(entryGroup0, entry0, 0);
      int int0 = entryGroupChangeEvent0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      Entry entry0 = mock(Entry.class, new ViolatedAssumptionAnswer());
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(entryGroup0, entry0, (-41));
      int int0 = entryGroupChangeEvent0.getType();
      assertEquals((-41), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(entryGroup0, (Entry) null, 2);
      int int0 = entryGroupChangeEvent0.getType();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(entryGroup0).toString();
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(entryGroup0, (Entry) null, 2);
      entryGroupChangeEvent0.getEntryGroup();
      assertEquals(2, entryGroupChangeEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(entryGroup0, (Entry) null, 2);
      entryGroupChangeEvent0.getEntry();
      assertEquals(2, entryGroupChangeEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Entry entry0 = mock(Entry.class, new ViolatedAssumptionAnswer());
      EntryGroupChangeEvent entryGroupChangeEvent0 = null;
      try {
        entryGroupChangeEvent0 = new EntryGroupChangeEvent((EntryGroup) null, entry0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }
}