package ar.edu.utn.frba.dds;

import com.google.common.base.Preconditions;

public class Color {
  private Integer colorRojo;
  private Integer colorVerde;
  private Integer colorAzul;

  public Color(Integer rojo, Integer verde, Integer azul) {
    Preconditions.checkNotNull(rojo, "El valor no puede ser nulo");
    Preconditions.checkNotNull(verde, "El valor no puede ser nulo");
    Preconditions.checkNotNull(azul, "El valor no puede ser nulo");
    this.colorRojo = rojo;
    this.colorVerde = verde;
    this.colorAzul = azul;
  }

  public Integer getColorRojo() {
    return colorRojo;
  }

  public Integer getColorVerde() {
    return colorVerde;
  }

  public Integer getColorAzul() {
    return colorAzul;
  }
}
