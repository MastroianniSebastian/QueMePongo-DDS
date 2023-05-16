package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Excepciones.ColorException;
import ar.edu.utn.frba.dds.Excepciones.MaterialException;
import ar.edu.utn.frba.dds.Excepciones.TipoException;

public class Prenda {
  private Color colorPrincipal;
  private Color colorSecundario;
  private Material material;
  private TipoDePrenda tipo;
  private Trama trama;

  private Categoria categoria;

  private Formalidad formalidad;

  //Se supone que el new Prenda(...) solo lo debe usar el Borrador
  //Por lo tanto solo el a traves del Borrador se puede instanciar
  //Una Prenda
  public Prenda(Color colorPrincipal, Color colorSecundario, Material material, TipoDePrenda tipo, Trama trama, Categoria categoria) {
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.tipo = tipo;
    this.trama = trama;
    this.categoria = categoria;
  }

  public boolean esSuperior() {
    return this.categoria == Categoria.PARTE_SUPERIOR;
  }

  public boolean esInferior() {
    return this.categoria == Categoria.PARTE_INFERIOR;
  }

  public boolean esAccesorio() {
    return this.categoria == Categoria.ACCESORIOS;
  }

  public boolean esCalzado() {
    return this.categoria == Categoria.CALZADO;
  }

  public boolean esInformal() {
    return this.formalidad == Formalidad.INFORMAL;
  }

  public boolean esFormal() {
    return this.formalidad == Formalidad.FORMAL;
  }

  public boolean esNeutra() {
    return this.formalidad == Formalidad.NEUTRA;
  }
}
