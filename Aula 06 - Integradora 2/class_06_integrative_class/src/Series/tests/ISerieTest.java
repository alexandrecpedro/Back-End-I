package Series.tests;

import Series.exceptions.SerieNotEnabledException;
import Series.services.ISerie;
import Series.services.impl.SerieListProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ISerieTest {
//    Checks if the app returns the link while the view limit is available
    @Test
    public void mayReturnSerieLinkWhenLimitAvailable() throws SerieNotEnabledException {
        ISerie serie = new SerieListProxy();
        String link = serie.getSerie("The Big Bang Theory");
        assertEquals("www.thebigbangtheory.com", link);
        System.out.println("Link: " + link);
    }

//    Checks if there is an exception in case of exceeded limit
    @Test
    public void mayThrowExceptionWhenExceededLimit() throws SerieNotEnabledException {
        ISerie serie = new SerieListProxy();
        serie.getSerie("13 Reasons Why");
        serie.getSerie("Stranger Things");
        serie.getSerie("Breaking Bad");
        serie.getSerie("The Big Bang Theory");
        serie.getSerie("The Witcher");
        
//        6th serie to add. Must show the exception
        SerieNotEnabledException serieException = assertThrows(SerieNotEnabledException.class, () -> serie.getSerie("Wanda Vision"));
        assertEquals("Exceeds the amount of allowed plays", serieException.getMessage());
        System.out.println(serieException.getMessage());
    }

}