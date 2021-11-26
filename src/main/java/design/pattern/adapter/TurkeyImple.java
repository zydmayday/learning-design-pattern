package design.pattern.adapter;

public class TurkeyImple implements Turkey{

  @Override
  public void gobble() {
    System.out.println("gobble");
  }
}
