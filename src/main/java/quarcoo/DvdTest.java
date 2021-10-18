package quarcoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DvdTest {
    @Test
    public void testDvdTitle(){
        dvd dvdTitle = new dvd ("Sci-fi", "N/A","Jurassic Park 2", "DV901", "Steven Spielberg", 186);
        assertEquals("DVD not found", "Jurassic Park 2", dvdTitle.getTitle());
    }

    @Test
    public void testDvdGenre(){
        dvd dvdGenre = new dvd ("Sci-fi", "N/A","Jurassic Park 2", "DV901", "Steven Spielberg", 186);
        assertEquals("DVD not found", "Sci-fi", dvdGenre.getGenre());
    }

    @Test
    public void testDvdISP(){
        dvd dvdISP = new dvd ("Sci-fi", "N/A","Jurassic Park 2", "DV901", "Steven Spielberg", 186);
        assertEquals("DVD not found", "DV901", dvdISP.getISP());
    }

    @Test
    public void testDvdAuthor(){
        dvd dvdAuthor = new dvd ("Sci-fi", "N/A","Jurassic Park 2", "DV901", "Steven Spielberg", 186);
        assertEquals("DVD not found", "N/A", dvdAuthor.getAuthor());
    }

    @Test
    public void testDvdProducer(){
        dvd dvdProducer = new dvd ("Sci-fi", "N/A","Jurassic Park 2", "DV901", "Steven Spielberg", 186);
        assertEquals("DVD not found", "Steven Spielberg", dvdProducer.producer());
    }

    @Test
    public void testDvdLength(){
        dvd lengthOfDvd = new dvd ("Sci-fi", "N/A","Jurassic Park 2", "DV901", "Steven Spielberg", 186);
        assertEquals("DVD not found", "186", lengthOfDvd.dvdLength());
    }
}
