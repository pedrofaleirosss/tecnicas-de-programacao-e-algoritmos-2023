package classes;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class converteMoeda {
    public String ConvMoeda(String valTela)
      {
        BigDecimal valor = new BigDecimal(valTela);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();  
        String formatado = nf.format(valor);
        
        return formatado;
        
      }
}
