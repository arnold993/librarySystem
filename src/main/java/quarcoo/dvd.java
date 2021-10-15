package quarcoo;

public class dvd extends disks {
    private float lengthDvd;

    public dvd(String genre, String author, String title, String ISP, String producer, float lengthDvd) {
        super(genre, author, title, ISP, producer);
        this.lengthDvd = lengthDvd;
    }

    public void dvdLength() {
        System.out.println("The dvd " + getTitle() + " is " + lengthDvd + " hours long");
    }


}
