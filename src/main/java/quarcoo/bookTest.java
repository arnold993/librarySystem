package quarcoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class bookTest {

    @Test
    public void testBooksAuthorMethod(){
        Books bookAuthor = new Books ( "Action", "J. K. Rowling", "Harry Potter","bk1234", 180);
        assertEquals("Wrong author", "J. K. Rowling", bookAuthor.getAuthor());
    }

    @Test
    public void testBooksTitleMethod(){
        Books bookTitle = new Books ( "Action", "J. K. Rowling", "Harry Potter, Prisoner of Azkaban ","bk1234", 180);
        assertEquals("Wrong ISP number", "Harry Potter, Prisoner of Azkaban ", bookTitle.getTitle());
    }

    @Test
    public void testBooksGenreMethod(){
        Books bookGenre = new Books ( "Action", "J. K. Rowling", "Harry Potter, Prisoner of Azkaban ","bk1234", 180);
        assertEquals("No title book found in this genre", "Action", bookGenre.getGenre());
    }

    @Test
    public void testBooksIspMethod(){
        Books bookIsp = new Books ( "Action", "J. K. Rowling", "Harry Potter, Prisoner of Azkaban ","bk1234", 180);
        assertEquals("Incorrect ISP", "bk1234", bookIsp.getISP());
    }

    @Test
    public void testBooksPagNumMethod(){
        Books bookPagNum = new Books ( "Action", "J. K. Rowling", "Harry Potter, Prisoner of Azkaban ","bk1234", 180);
        assertEquals("Title not found", bookPagNum.printNumPages(), bookPagNum.printNumPages());
    }

}
