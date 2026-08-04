class Fruit {
    String name;
    String taste;
    String size;
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    public void eat() {
        System.out.println("Fruit: " + name + " tastes " + taste + ".");
    }
}
class Apple implements Fruit {
    public Apple(String size) {
        super("Apple", "sweet and crisp", size);
    }
    @Override
    public void eat() {
        System.out.println("Eating a " + size + " apple. It tastes " + taste + ".");
    }
}
class Orange implements Fruit {
    public Orange(String size) {
        super("Orange", "tangy and juicy", size);
    }
    @Override
    public void eat() {
        System.out.println("Eating a " + size + " orange. It tastes " + taste + ".");
    }
}
public class MainFruit {
    public static void main(String[] args) {
        Fruit myApple = new Apple("medium");
        Fruit myOrange = new Orange("large");
        myApple.eat();
        myOrange.eat();
    }
