public class Notification
{
    private INotification notification;

    public  Notification(INotification notificaton)
    {
        this.notification = notificaton;
    }

    public void notifyUser2()
    {
        notification.notifyUser();
    }

}
