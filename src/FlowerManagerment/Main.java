package FlowerManagerment;

import Objects.Detail;
import Objects.Flower;
import Objects.OrderList;
import Objects.SetFlower;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Detail> beIndetails = new HashMap<Integer, Detail>();
        SetFlower set = new SetFlower();
        set.addFlowerInstance(new Flower(1, "Sale", "1/1/2023", 50, "Rose", beIndetails));
        set.addFlowerInstance(new Flower(2, "Sa", "2/2/2023", 60, "rose", beIndetails));
        set.addFlowerInstance(new Flower(3, "Sa", "2/2/2023", 80, "watermelon", beIndetails));
      
        set.deleteFlower();

        System.out.println("\t\t\tAfter deleting");
        set.display();
//        OrderList orderList = new OrderList();
//        orderList.addOrder(set);
    }

}
