package practiceSTCM.practiceSTCM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

     public class D {
     @BeforeMethod
     public void bm() {
	 System.out.println("bm");}
     
     @Test
     public void test7() {
	 System.out.println("test7");}
     
     @Test
     public void test8() {
	 System.out.println("test8");}
     
     @AfterMethod
     public void am() {
     System.out.println("am");}
     
     @AfterClass
     public void ac() {
     System.out.println("ac");}
     
     @BeforeClass
     public void bc() {
     System.out.println("bc");}
     
     @BeforeTest
     public void bt() {
     System.out.println("bt");}
     
     @BeforeSuite
     public void bs() {
     System.out.println("bs");}


}
