public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Heart-Clogger", "Triple Angus Beef Patties and Bacon ", 14.99, "Sesame-Seed bun");
        super.Addition1Added("Chips", 2.27);
        super.Addition2Added("Soda", 1.25);
    }

    @Override
    public void Addition1Added(String name, double price) {
        System.out.println("cannot add additional items to deluxe burgers");
    }

    @Override
    public void Addition2Added(String name, double price) {
        System.out.println("cannot add additional items to deluxe burgers");
    }

    @Override
    public void Addition3Added(String name, double price) {
        System.out.println("cannot add additional items to deluxe burgers");
    }

    @Override
    public void Addition4Added(String name, double price) {
        System.out.println("cannot add additional items to deluxe burgers");
    }
}
