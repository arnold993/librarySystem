package quarcoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class audioBookTest {



    @Test
    public void testAudiobookTitleMethod(){
        audiobooks audioBookTitle = new audiobooks ("Religion", "Joyce Mayer", "Battlefield of the mind", "au456");
        assertEquals("Audiobook not found", "Battlefield of the mind", audioBookTitle.getTitle());
    }

    @Test
    public void testAudiobookGenre(){
        audiobooks audiobookGenre = new audiobooks ("Religion", "Joyce Mayer", "Battlefield of the mind", "au456");
        assertEquals("Audiobook not found", "Religion", audiobookGenre.getGenre());
    }

    @Test
    public void testAudiobookIsp(){
        audiobooks audiobookISP = new audiobooks ("Religion", "Joyce Mayer", "Battlefield of the mind", "au456");
        assertEquals("Audiobook not found", "au456", audiobookISP.getISP());
    }

    @Test
    public void testAudiobookAuthor(){
        audiobooks audiobookAuthor = new audiobooks ("Religion", "Joyce Mayer", "Battlefield of the mind", "au456");
        assertEquals("Audiobook not found", "Joyce Mayer", audiobookAuthor.getAuthor());
    }
}
