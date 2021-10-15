package quarcoo;

public abstract class libraryContent {

        //ATTRIBUTES
        private String genre;
        private String author;
        private String title;
        private String ISP;

        // CONSTRUCTOR

        public libraryContent (String genre, String author, String title, String ISP){
            this.genre = genre;
            this.author = author;
            this.title = title;
            this.ISP = ISP;
        }

        // METHODS
        public void setGenre(String genre){
            this.genre = genre;
        }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setISP(String ISP){
        this.ISP = ISP;
    }

    public String getGenre(){
        return this.genre;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public String getISP(){
        return this.ISP;
    }

}
