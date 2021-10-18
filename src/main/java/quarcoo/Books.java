package quarcoo;

public class Books extends libraryContent {

    private int pageNum;


    public Books(String genre, String author, String title, String ISP, int pageNum){
        super(genre, author, title, ISP);
        this.pageNum= pageNum;
    }

    public int printNumPages() {
        return  pageNum;
    }

}
