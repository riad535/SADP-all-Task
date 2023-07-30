public class Test 
{
    public static void verify(SocialMedia socialMedia)
    {
        socialMedia.chat();
        socialMedia.sharePhotosVideos();
    }

    public static void verify2(SocialMediaPostManager socialMediaPostManager)
    {
        socialMediaPostManager.publicPost();
    }


    public static void main(String[] args)
    {
        verify(new Facebook());

        verify(new WhatsApp());

        verify2(new Instagram());

        verify2(new Facebook());
    }
    
}
