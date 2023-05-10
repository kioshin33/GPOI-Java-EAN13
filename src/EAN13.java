/** 
 * @author Fabrizio La volpe
 * @version 1.0
 * @since 10/05/2023
 * 
*/
public class EAN13 {
    
    private String codice;

   /**
    * classe costruttore che ha il compito di creare un nuovo codice EAN13
    * @param c diventa il nuovo codice EAN13
    */
    public void setCodice(String c){
        codice = c;
    }

    /**
     * metodo per mandare in stampa il codice 
     * @return ritorna il codice creato in precedenza
     */
    public String getCodice(){
        return codice;
    }

    /**
     *  metodo per verificare se il codice è nullo, di lunghezza sbagliata , calcola la cifra du controllo, confronta la cifra di controllo con quella contenuta nel codice EAN13
     *  @param codice creato in precedenza
     *  @param somma 
     *  @param cifra 
     *  @param cifraDiControllo
     * 
     * @return la cifra di controllo
     */
    public boolean verificaCodice(){

        // Verifica se l'attributo codice è vuoto o nullo
        if (codice.equals(null) || codice == ""){
            throw new NullPointerException("Il codice EAN-13 risulta vuoto o nullo");
        }

        // Verifica se la lunghezza dell'attributo codice è di 13
        if(codice.length() != 13) {
            return false;
        }
        
        // Implementazione dell'algoritmo di calcolo della cifra di controllo
        int somma = 0;
        int cifra;
        
        for(int i = 0; i < codice.length() - 1; i++) {   
            cifra = Character.getNumericValue(codice.charAt(i));
            
            if(i % 2 == 0) {
                somma += cifra * 1;  
            } else {
                somma += cifra * 3; 
            }
        }
        
        // Calcola la cifra di controllo
        int cifraDiControllo = (10 - (somma % 10));

        // Confronta la cifra di controllo con quella contenuta nel codice EAN13 (ultima cifra)
        return cifraDiControllo == Character.getNumericValue(codice.charAt(12)); 
    }

    public void setEAN13(String string) {
    }


}
