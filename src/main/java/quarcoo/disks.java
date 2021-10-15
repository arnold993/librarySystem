package quarcoo;
public abstract class disks extends libraryContent {

    private String producer;

    public disks (String genre, String author, String title, String ISP, String producer) {
        super(genre, author, title, ISP);

        this.producer = producer;


    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getProducer() {
        return this.producer;
    }

}
