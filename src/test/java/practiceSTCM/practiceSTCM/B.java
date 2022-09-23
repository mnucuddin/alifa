package practiceSTCM.practiceSTCM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

     public class B {
     @BeforeMethod
     public void bm() {
	 System.out.println("bm");}
     
     @Test
     public void test3() {
	 System.out.println("test3");}
     
     @Test
     public void test4() {
	 System.out.println("test4");}
     
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
     
     @AfterSuite
     public void as() {
     System.out.println("as");}


}
