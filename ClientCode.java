package Products;

import java.util.ArrayList;
import java.util.List;

public class ClientCode{
    public static void main(String[] args) {

    
            List<Product> productList = new ArrayList<>();
    
    
            productList.add(new HotDrink(90, "tea", 200, 60));
            productList.add(new HotDrink(100, "espresso", 50, 70));
            productList.add(new HotDrink(150, "cocoa", 300, 60));
            productList.add(new HotDrink(150, "cappuccino", 350, 75));
    
            HotDrinksMachine vendingMachine = new HotDrinksMachine();
            vendingMachine.initProduct(productList);
    
            System.out.println(vendingMachine.getProduct("cappuccino", 350, 75));
    
            
        }
    }

       