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
    
            List<Product> productList1 = new ArrayList<>();
            productList1.add(new HotDrink(90, "icetea", 200, 18));
            productList1.add(new HotDrink(100, "water", 200, 22));
            productList1.add(new HotDrink(150, "applejuice", 200, 22));
            productList1.add(new HotDrink(150, "frape", 300, 18));
    
            HotDrinksMachine vendingMachine1 = new HotDrinksMachine();
            vendingMachine1.initProduct(productList1);
    
            System.out.println(vendingMachine1.getProduct("water", 200, 22));
            
        }
    }

       