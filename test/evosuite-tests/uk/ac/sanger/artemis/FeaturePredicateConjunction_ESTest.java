/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:21:38 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FeaturePredicate;
import uk.ac.sanger.artemis.FeaturePredicateConjunction;
import uk.ac.sanger.artemis.FeaturePredicateVector;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeaturePredicateConjunction_ESTest extends FeaturePredicateConjunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeaturePredicateConjunction featurePredicateConjunction0 = null;
      try {
        featurePredicateConjunction0 = new FeaturePredicateConjunction((FeaturePredicateVector) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.FeaturePredicateConjunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeaturePredicateVector featurePredicateVector0 = new FeaturePredicateVector();
      featurePredicateVector0.add((FeaturePredicate) null);
      FeaturePredicateConjunction featurePredicateConjunction0 = new FeaturePredicateConjunction(featurePredicateVector0, 1);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(" values based on header record ");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      simpleEntryGroup0.createEntry();
      Feature feature0 = simpleEntryGroup0.createFeature();
      // Undeclared exception!
      try { 
        featurePredicateConjunction0.testPredicate(feature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.FeaturePredicateConjunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FeaturePredicateVector featurePredicateVector0 = new FeaturePredicateVector();
      FeaturePredicateConjunction featurePredicateConjunction0 = null;
      try {
        featurePredicateConjunction0 = new FeaturePredicateConjunction(featurePredicateVector0, 1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - no predicates given to FeaturePredicateConjunction constructor
         //
         verifyException("uk.ac.sanger.artemis.FeaturePredicateConjunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FeaturePredicateVector featurePredicateVector0 = new FeaturePredicateVector();
      FeaturePredicateConjunction featurePredicateConjunction0 = null;
      try {
        featurePredicateConjunction0 = new FeaturePredicateConjunction(featurePredicateVector0, 512);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - illegal type given to FeaturePredicateConjunction constructor
         //
         verifyException("uk.ac.sanger.artemis.FeaturePredicateConjunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FeaturePredicateVector featurePredicateVector0 = new FeaturePredicateVector();
      FeaturePredicateConjunction featurePredicateConjunction0 = null;
      try {
        featurePredicateConjunction0 = new FeaturePredicateConjunction(featurePredicateVector0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - no predicates given to FeaturePredicateConjunction constructor
         //
         verifyException("uk.ac.sanger.artemis.FeaturePredicateConjunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Key key0 = Key.CDS;
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "Type may not be null", "Type may not be null");
      FeaturePredicateConjunction featurePredicateConjunction0 = new FeaturePredicateConjunction(featureKeyQualifierPredicate0, featureKeyQualifierPredicate0, 1);
      assertEquals(0, FeaturePredicateConjunction.OR);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "entropy");
      FeaturePredicateConjunction featurePredicateConjunction0 = null;
      try {
        featurePredicateConjunction0 = new FeaturePredicateConjunction(featureKeyQualifierPredicate0, featureKeyQualifierPredicate0, 120);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - illegal type given to FeaturePredicateConjunction constructor
         //
         verifyException("uk.ac.sanger.artemis.FeaturePredicateConjunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "");
      FeaturePredicateConjunction featurePredicateConjunction0 = new FeaturePredicateConjunction(featureKeyQualifierPredicate0, featureKeyQualifierPredicate0, 0);
      // Undeclared exception!
      try { 
        featurePredicateConjunction0.testPredicate((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.FeatureKeyQualifierPredicate", e);
      }
  }
}