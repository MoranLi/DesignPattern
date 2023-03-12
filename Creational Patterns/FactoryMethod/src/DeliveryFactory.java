import DeliveryTools.Ship;
import DeliveryTools.Truck;

import DeliveryTools.DeliveryTools;
public class DeliveryFactory {
    public static DeliveryTools createDeliveryTool(int flag){
        if(flag == 1) return new Truck();
        else return new Ship();
    }
}
