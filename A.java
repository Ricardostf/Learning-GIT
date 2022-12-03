public class A {
  private int A1;
  private double A2;
  
  public A(){
    A1 = 1;
    A2 = 0.333;
  }
  
  public int getA1(){
    return A1;
  }
  public double getA2(){
    return A2;
  }
  public void setA1(int x){
    A1 = x;
  }
  public void setA2(double x){
    A2 = x;
  }
  public void MA1(){
    System.out.println("MA1");
  }
  public void MA2(){
    System.out.println("MA2");
  }
  public void MA3(){
    System.out.println("Alteração a classe A partir do clone");
  }
}
