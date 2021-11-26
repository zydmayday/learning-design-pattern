package design.pattern.adapter;

public class AdapterMain {
  public static void main(String[] args) {
    Duck duck = new DuckImple();
    duck.quack();

    Turkey turkey = new TurkeyImple();
    Duck duck2 = new TurkeyAdapter(turkey);
    duck2.quack();

  }
}
