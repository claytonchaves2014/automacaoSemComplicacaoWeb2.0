package br.com.chronosacademy.media;

import br.com.chonosacademy.media.Media;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test
    public void validaAprovado(){
       double n1 = 5;
       double n2 = 5;

       Media media = new Media();
      String resultado =  media.resultadoMedia(n1, n2);
        System.out.println(resultado);

      assertEquals("Aprovado", resultado);

    }


    @Test
    public void validaReprovado(){

    }
}