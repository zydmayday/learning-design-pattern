package design.pattern.factory;

public class PizzaStore {
  Pizza orderPizza(String type) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    Pizza pizza = factory.getPizza(type);
    pizza.bake();
    pizza.cut();
    return pizza;
  }
}
