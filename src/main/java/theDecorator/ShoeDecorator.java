package theDecorator;

public class ShoeDecorator implements Product {


    public  Product instance;

    public ShoeDecorator(Product instance){
       this.instance = instance;
}

    @Override
    public double buy() {
   //     return instance.buy();

        return 0;
    }

    @Override
    public void displayInfo() {
        instance.displayInfo();

    }
}
