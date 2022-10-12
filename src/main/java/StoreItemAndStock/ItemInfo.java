package StoreItemAndStock;

import static StoreItemAndStock.ItemRepository.*;

public class ItemInfo extends ItemRepository{

    public void orderItem(){
        System.out.println(storeStock);
        System.out.println("please check");
        String orderName = sc.nextLine();
        Integer oderSize = storeStock.get(orderName);
        Integer newSize = Math.min(MAXITEMSIZE - oderSize,0);
        storeStock.replace(orderName, oderSize, newSize);
    }


}
