package FactoryMethod;

public class MessangeNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending messange notification");
    }
    
}
