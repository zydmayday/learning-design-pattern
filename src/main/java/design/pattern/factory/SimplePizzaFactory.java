package design.pattern.factory;

public class SimplePizzaFactory {

  Pizza getPizza(String type) {
    Pizza pizza = null;
    switch (type) {
      case "1":
        pizza = new Pizza1();
        break;
      case "2":
        pizza = new Pizza2();
        break;
    }
    return pizza;
  }

}
