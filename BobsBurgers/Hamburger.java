public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String bunType;

    private String addOn1Name;
    private double addOn1Price;

    private String addOn2Name;
    private double addOn2Price;

    private String addOn3Name;
    private double addOn3Price;

    private String addOn4Name;
    private double addOn4Price;


    public Hamburger(String name, String meat, double price, String bunType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bunType = bunType;
    }
    public void Addition1Added(String name, double price){
        this.addOn1Name = name;
        this.addOn1Price = price;
    }
    public void Addition2Added(String name, double price){
        this.addOn2Name = name;
        this.addOn2Price = price;
    }
    public void Addition3Added(String name, double price){
        this.addOn3Name = name;
        this.addOn3Price = price;
    }
    public void Addition4Added(String name, double price){
        this.addOn4Name = name;
        this.addOn4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.bunType + " bun" + " with " + this.meat + ", price is " + this.price);
        if(this.addOn1Name != null) {
            hamburgerPrice += this.addOn1Price;
            System.out.println("Added " + this.addOn1Name + " for an extra " + this.addOn1Price);
        }

        if(this.addOn2Name != null) {
            hamburgerPrice += this.addOn2Price;
            System.out.println("Added " + this.addOn2Name + " for an extra " + this.addOn2Price);
        }

        if(this.addOn3Name != null) {
            hamburgerPrice += this.addOn3Price;
            System.out.println("Added " + this.addOn3Name + " for an extra " + this.addOn3Price);
        }

        if(this.addOn4Name != null) {
            hamburgerPrice += this.addOn4Price;
            System.out.println("Added " + this.addOn4Name + " for an extra " + this.addOn4Price);
        }
        return hamburgerPrice;
    }
}
