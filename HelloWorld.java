import java.util.*;
class Base{
  public void message()
  {
      System.out.println("You don't deserve it son!");
  }
}
class Child extends Base
{
  @Override
  public void message()
  {
    System.out.println("I do!");
  }
}
public class HelloWorld
{
  static void quarrel(Base b)
  {
    b.message();
  }
  static void fun()
  {
    int one = 123;
    int two = 3456;
    System.out.println(one+""+two);
  }
  public static void main(String[] args)
  {
    System.out.println("currently on branch 3");
    System.out.println("Watch out !!");
    System.out.println("Watching !");
    System.out.println("oh ho");
    HelloWorld.fun();
    Base b[] = {new Base(),new Child(), new Base(){
      @Override
      public void message(){

      System.out.println("Bahut hua samman \nTumahri aisii tesi");
    }}};
    HelloWorld.quarrel(b[0]);
    HelloWorld.quarrel(b[1]);
    HelloWorld.quarrel((b[2]));
    branching.param = "asdfgh";
    System.out.println(branching.param);
    System.out.println("wadefregthyjuki");

  }
}

class branching{
  static String param;
  branching(String val)
  {
    param = val;
  }
}
