public class Facebook implements SocialMedia,SocialMediaGroupCall,SocialMediaPostManager 
{
    public void chat()
    {
        System.out.println("Facebook chat");
    }

    public void publicPost()
    {
        System.out.println("Facebook post");
    }

    public void sharePhotosVideos()
    {
        System.out.println("Facebook photos and videos");
    }

    public void groupVideoCall()
    {
        System.out.println("Facebook group video call");
    }
    
}
