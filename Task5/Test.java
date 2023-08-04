public class Test 
{
    public static void main(String[] args)
    {

        CallNotification2 no = new CallNotification2();

        MsgNotification no1 = new MsgNotification();
        

        Notification notification = new Notification(no);
        Notification notification1 = new Notification(no1);

        notification.notifyUser2();
        notification1.notifyUser2();

    }
    
}
