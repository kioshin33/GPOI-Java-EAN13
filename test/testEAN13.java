import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class testEAN13 {

    
    private EAN13 EAN13;

    @Before
    public void init(){
        EAN13 = new EAN13();
    }

    @Test 
    public void testEanVerificaCodiceValido(){
        EAN13.setEAN13("3614273613422");
        assertTrue(EAN13.verificaCodice());
    }

    @Test
    public void testEanVerificaCodiceNonValido(){
        EAN13.setEAN13("3614273613422");
        assertFalse(EAN13.verificaCodice());
    }

    @Test
    public void testEanVerificaCodiceLunghezzaNonValida(){
        EAN13.setEAN13("3614273613422");
        assertFalse(EAN13.verificaCodice());
    }

    @Test
    public void testEanVerificaCodiceVuoto(){
        EAN13.setEAN13("3614273613422");
        assertThrows(NullPointerException.class,null);    
    
    }

    


    
}




