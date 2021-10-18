package quarcoo;

public class dvd extends disks {
    private float dvdLength;
    private String producer;

    public dvd(String genre, String author, String title, String ISP, String producer, float lengthDvd) {
        super(genre, author, title, ISP, producer);
        this.dvdLength = lengthDvd;
    }

    public float dvdLength() {
        return dvdLength;
    }

    public String producer() {
        return producer;
    }


}
