package quarcoo;

    public class Main {
        public static void main(String[] args) {
            Books book = new Books("Biography", "kevin Hard", "The decision", "bk456", 180);
            book.printNumPages();

            dvd newDvd = new dvd("Action", "J. K. Rowling", "Harry Potter, Prisoner of Azkaban ", "dvd1234", "Alfonso Cuarón", 1.4f);
            newDvd.dvdLength();

            cd cdNew = new cd(" Pop", "Michael Jackson", "Thriller", "cd987", "Micheal Jackson", 80);
            cdNew.cdName();

            audiobooks audioNew = new audiobooks("Religion" ,"Joyce Mayer", "Battlefiled of the mind", "au1928");
            audioNew.audioRating();

        }
    }