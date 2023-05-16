package ar.edu.utn.frba.dds;

import com.google.common.base.Preconditions;

public class Color {
  private int rojo;
  private int verde;
  private int azul;

  public Color(int rojo, int verde, int azul) {
    Preconditions.checkNotNull(rojo, "El valor no puede ser nulo");
    Preconditions.checkNotNull(verde, "El valor no puede ser nulo");
    Preconditions.checkNotNull(azul, "El valor no puede ser nulo");
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }
}
