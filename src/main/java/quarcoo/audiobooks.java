package quarcoo;

public class audiobooks extends libraryContent
{
    private String audioRating;

    public audiobooks (String genre, String author, String title, String ISP){
        super(genre, author, title, ISP);
    }

    public void audioRating() {
        System.out.println("The audiobook " + getTitle() + " has a 5 stars rating");
    }
}
