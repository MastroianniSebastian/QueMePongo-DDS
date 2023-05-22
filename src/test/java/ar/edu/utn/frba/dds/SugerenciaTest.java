package ar.edu.utn.frba.dds;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SugerenciaTest {
  ProveedorDeServicioClimatico proveedorDeServicioClimatico = new ProveedorDeServicioClimatico();

  @Test
  public void probandoMockAccuWeather() {
    proveedorDeServicioClimatico.setServicioClimatico(new ServicioAccuWeather());
    ServicioClimatico servicioClimatico = ProveedorDeServicioClimatico.getServicioClimatico();
    assertEquals(servicioClimatico.obtenerTemperaturaActualEnLaCiudad("Buenos Aires, Argentina").getValor(), 57);
  }

  @Test
  public void unaRemeraDeMangaCortaPuedeSerCreadaCorrectamenteMEdianteElBorrado() {
    assertEquals(remeraMangaCorta().esSuperior(), true);
  }

  private Prenda remeraMangaCorta() {
    Borrador borrador = new Borrador(TipoDePrenda.REMERA);
    borrador.especificarMaterial(Material.ALGODON);
    borrador.especificarColorPrincipal(new Color(100, 100, 100));
    borrador.especificarCategoria(Categoria.PARTE_SUPERIOR);
    borrador.especificarTrama(Trama.RAYADA);
    borrador.especificarFormalidad(Formalidad.INFORMAL);
    borrador.especificarTemperaturaMaximaAdecuada(20);
    return borrador.crearPrenda();
  }

  private Prenda jean() {
    Borrador borrador = new Borrador(TipoDePrenda.PANTALON);
    borrador.especificarMaterial(Material.CUERO);
    borrador.especificarColorPrincipal(new Color(100, 50, 100));
    borrador.especificarCategoria(Categoria.PARTE_INFERIOR);
    borrador.especificarTrama(Trama.LISA);
    borrador.especificarFormalidad(Formalidad.INFORMAL);
    borrador.especificarTemperaturaMaximaAdecuada(20);
    return borrador.crearPrenda();
  }

  private Prenda zapatillasVansRePiolas() {
    Borrador borrador = new Borrador(TipoDePrenda.ZAPATILLAS);
    borrador.especificarMaterial(Material.LONA);
    borrador.especificarColorPrincipal(new Color(100, 100, 100));
    borrador.especificarCategoria(Categoria.CALZADO);
    borrador.especificarTrama(Trama.LISA);
    borrador.especificarFormalidad(Formalidad.INFORMAL);
    borrador.especificarTemperaturaMaximaAdecuada(30);
    return borrador.crearPrenda();
  }
}
