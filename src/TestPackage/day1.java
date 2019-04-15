package TestPackage;


import org.testng.annotations.Test;

public class day1{
	
  @Test(invocationCount=7)
  public void Demo()
  {
    System.out.println("run it 7 times");
  }
  @Test
  public void Method2()
  {
	  System.out.println("Bye");
	  
  }
}
