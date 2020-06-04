public class Main {

    public static void main(String[] args) {

       /* Project BOBS BURGERS
        The purpose of the application is to help a fictitious company called "Bobs Burgers" to manage their process of selling hamburgers.
        My application will help Bob to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.
        There will be a base hamburger, but also two other specialty types of hamburgers that are popular ones in Bob's shop.
        The basic hamburger should have the following items: Bread Roll Type, meat, and up to 4-additions( lettuce, pickles, tomatoes etc)
        The customer can select what to be added to the burger.
        Each one of these items gets charged an additional price (track how many got added and pricing)and find the total price.
        */





       Hamburger hamburger = new Hamburger("Bob's Reg", "beef", 4.00, "regular");
       double price = hamburger.itemizeHamburger();
       hamburger.Addition1Added("Tomaato", 0.27);
       hamburger.Addition2Added("Lettuce", 0.75);
       hamburger.Addition3Added("Cheese", 1.12);
        System.out.println("Total burger price: " + hamburger.itemizeHamburger());

        HealthyBurger Veggie = new HealthyBurger("Bacon", 5.67);
        Veggie.Addition1Added("Egg", 5.43);
        Veggie.addHealthAddition1("Pickles", 2.01);
        System.out.println("Total Healthy Burger price is " + Veggie.itemizeHamburger() );


        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
    }
}
