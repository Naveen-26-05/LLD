package FactoryMethod;

public class NotificationFactory {
    public NotificationFactory(){}
    public Notification createNotification(String type ){
        if(type.equals("email")){
            return new EmailNotification();
        }else{
            return new MessangeNotification();
        }
    }
    
}
