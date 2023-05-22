package ar.edu.utn.frba.dds;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrendaTest {
  @Test
  public void testEsSuperior() {
    Borrador borrador = new Borrador(TipoDePrenda.CAMISA);
    borrador.especificarColorPrincipal(new Color(0,100,0));
    borrador.especificarMaterial(Material.ALGODON);
    borrador.especificarTrama(Trama.LISA);
    borrador.especificarCategoria(Categoria.PARTE_SUPERIOR);
    borrador.especificarFormalidad(Formalidad.INFORMAL);
    borrador.especificarTemperaturaMaximaAdecuada(30);

    Prenda prenda = borrador.crearPrenda();
    assertTrue(prenda.esSuperior());
  }

  @Test
  public void testEsInferior() {
    Borrador borrador = new Borrador(TipoDePrenda.PANTALON);
    borrador.especificarColorPrincipal(new Color(20,20,20));
    borrador.especificarMaterial(Material.ALGODON);
    borrador.especificarTrama(Trama.LISA);
    borrador.especificarCategoria(Categoria.PARTE_INFERIOR);
    borrador.especificarFormalidad(Formalidad.NEUTRA);
    borrador.especificarTemperaturaMaximaAdecuada(25);

    Prenda prenda = borrador.crearPrenda();
    assertTrue(prenda.esInferior());
  }

  @Test
  public void testEsesorio() {
    Borrador borrador = new Borrador(TipoDePrenda.POLLERA);
    borrador.especificarColorPrincipal(new Color(30,30,21));
    borrador.especificarMaterial(Material.CUERO);
    borrador.especificarTrama(Trama.LISA);
    borrador.especificarCategoria(Categoria.PARTE_INFERIOR);
    borrador.especificarFormalidad(Formalidad.FORMAL);
    borrador.especificarTemperaturaMaximaAdecuada(32);

    Prenda prenda = borrador.crearPrenda();
    assertTrue(prenda.esFormal());
  }

  // Resto de pruebas utilizando Borrador...
}
