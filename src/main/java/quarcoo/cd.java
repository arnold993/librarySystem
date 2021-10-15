package quarcoo;

public class cd extends disks {
    private float lengthCd;

    public cd (String genre, String author, String title, String ISP, String producer, float lengthCd) {
        super(genre, author, title, ISP, producer);
        this.lengthCd = lengthCd;
    }

    public void cdName() {
        System.out.println("This cd from " + getAuthor() + "was the best selling album in 1994 and it is only " + lengthCd + " minutes long");
    }

}