package theDecorator;

public class SportsShoe extends ShoeDecorator {
    public int qty = 0;
    public String name;
    public double price =0;
    public double totalPrice = 0;
Product instance;


    public SportsShoe(Product instance) {
        super(instance);
        this.instance = instance;
        this.qty = qty;
        this.price = price;
        this.name = name;

    }

    public double buy() {
       totalPrice = this.qty * price;
        System.out.println("You have bought "+ totalPrice+ " - "+  name );

        return totalPrice;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sports Shoe features ");
        System.out.println("Brand name: " + this.name);



    }
}
