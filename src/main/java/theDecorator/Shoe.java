package theDecorator;

public class Shoe implements Product {

   public String name;
   public int qty;
    public double price;
     public double totalPrice;


   public Shoe(String name, int qty, double price){
        this.name = name;
        this.qty = qty;
        this.price = price;
    }


    @Override
    public double buy() {
       this.totalPrice = price * qty;
        System.out.println("The total price : " + totalPrice);
        addCart.add(new Shoe(this.name, this.qty,this.price));
        return totalPrice ;
    }

    @Override
    public void displayInfo() {
        System.out.println("Basic Shoe");
    }
}
