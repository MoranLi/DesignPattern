class Delivery{
    public static void doDelivery(int flag){
        DeliveryFactory.createDeliveryTool(flag).deliver();
    }
    public static void main(String[] args) {
        doDelivery(1);
        doDelivery(2);
    }
}