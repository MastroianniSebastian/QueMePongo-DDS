package ar.edu.utn.frba.dds;

public class Prenda {
  private Color colorPrincipal;
  private Color colorSecundario;
  private Material material;
  private TipoDePrenda tipo;
  private Trama trama;

  private Categoria categoria;

  private Formalidad formalidad;

  private Integer temperaturaMaximaAdecuada;

  //Se supone que el new Prenda(...) solo lo debe usar el Borrador
  //Por lo tanto solo el a traves del Borrador se puede instanciar
  //Una Prenda


  public Prenda(Color colorPrincipal, Color colorSecundario, Material material,
                TipoDePrenda tipo, Trama trama, Categoria categoria,
                Formalidad formalidad, Integer temperaturaMaximaAdecuada) {
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.tipo = tipo;
    this.trama = trama;
    this.categoria = categoria;
    this.formalidad = formalidad;
    this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
  }

  public boolean esSuperior() {
    return this.categoria == Categoria.PARTE_SUPERIOR;
  }

  public boolean esInferior() {
    return this.categoria == Categoria.PARTE_INFERIOR;
  }

  public boolean esesorio() {
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

  public boolean esAdecuada(Temperatura temperaturaActual) {
    return temperaturaActual.getValor() <= this.temperaturaMaximaAdecuada;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Material getMaterial() {
    return material;
  }

  public TipoDePrenda getTipo() {
    return tipo;
  }

  public Trama getTrama() {
    return trama;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Formalidad getFormalidad() {
    return formalidad;
  }

  public Integer getTemperaturaMaximaAdecuada() {
    return temperaturaMaximaAdecuada;
  }
}
