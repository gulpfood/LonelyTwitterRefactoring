package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet {


    @Override
    public boolean isValidBody() {
        if (getTweetBody().trim().length() == 0
                || getTweetBody().trim().length() > 20) {
            return false;
        }

        return false;
    }
}
