public class B {
  private int B1;
  private double B2;
  
  public B(){
    B1 = 1;
    B2 = 0.333;
  }
  
  public int getB1(){
    return B1;
  }
  public double getB2(){
    return B2;
  }
  public void setB1(int x){
    B1 = x;
  }
  public void setB2(double x){
    B2 = x;
  }
  public void MB1(){
    System.out.println("MB1");
  }
  public void MB2(){
    System.out.println("MB2");
  }
}
