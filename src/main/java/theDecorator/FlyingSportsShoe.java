package theDecorator;

public class FlyingSportsShoe extends ShoeDecorator{
    public FlyingSportsShoe(Product product){
        super(product);
    }
    @Override
    public double buy() {
        return 0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a super cool flying-shoe");

    }
}
