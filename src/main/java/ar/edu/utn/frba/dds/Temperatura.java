package ar.edu.utn.frba.dds;

public class Temperatura {

  private Integer valor;
  private Unidad unidad;

  public Temperatura(Integer valor, Unidad unidad) {
    this.valor = valor;
    this.unidad = unidad;
  }

  public Integer getValor() {
    return valor;
  }

  public Unidad getUnidad() {
    return unidad;
  }
}
