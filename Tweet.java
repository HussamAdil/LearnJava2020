public class Tweet {
   private String tweet_id ;
   private String tweet_message;
public Tweet(String tid ,String tmessage)
{
    this.tweet_id = tid ;
    this.tweet_message = tmessage;
}
    public void newTweet(String tid ,String tmessage)
    {
        this.tweet_id = tid ;
        this.tweet_message = tmessage;
    }

   public void reply(String tid ,String tmessage)
   {
        System.out.println(" Reply : ");

        System.out.println(" Form : " + this.tweet_id);

        System.out.println(" to : " + tid);

        System.out.println("m : " + tmessage);
   }
   public void retweet(String rtid ,String tmessage)
   {
       System.out.println(" Retweet : " + " @ " + rtid );

       System.out.println("m : " + tmessage);

   }
}
