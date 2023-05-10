import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class testEAN13 {

    
    private EAN13 ean ;

    @Before
    public void init(){
        ean = new EAN13();
    }

    @Test 
    public void testEanVerificaCodiceValido(){
        ean.setCodice("3614273613422");
        assertTrue(ean.verificaCodice());
    }

    @Test
    public void testEanVerificaCodiceNonValido(){
        ean.setCodice("3614273613412");
        assertFalse(ean.verificaCodice());
    }

    @Test
    public void testEanVerificaCodiceLunghezzaNonValida(){
        ean.setCodice("36142736134ffdsf22");
        assertFalse(ean.verificaCodice());
    }

    @Test
    public void testEanVerificaCodiceVuoto(){
        assertThrows(NullPointerException.class, () ->{
            ean.setCodice("3614273613422");
        });    
    
    }

    


    
}




