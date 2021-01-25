package theDecorator;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {

//        buy(new Shoe("Carvella", 3 , 1600));
//        buy(new discountShoe("Carvella", 4 , 1600));
//
//        Product product = new Shoe("Toughies", 3, 150.00);
//        System.out.println(product.displayInfo());

        Product product1 = new SportsShoe(new Shoe("Air Force", 3, 150.00));
        product1.displayInfo();
        product1.buy();
        System.out.println();
        Product product2 = new FlyingSportsShoe(product1);
        product2.buy();
        Product product3 = new Shoe("Mswenko Station",5,200);
        product3.buy();
        Product product4 = new Shoe("Jordans",2,1500);
        product4.buy();
        Product product5 = new Shoe("Mbatata",3,800);
        product5.buy();



        Product product = new ShoeDecorator(new Shoe("Isicathulo", 2,450.00));
        product.displayInfo();
        // product.buy();






    }
}
