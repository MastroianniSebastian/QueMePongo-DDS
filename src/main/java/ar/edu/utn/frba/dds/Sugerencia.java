package ar.edu.utn.frba.dds;

import com.google.common.base.Preconditions;

public class Sugerencia {
  Prenda superior;
  Prenda inferior;
  Prenda calzado;

  public Sugerencia(Prenda superior, Prenda inferior, Prenda calzado) {
    Preconditions.checkNotNull(superior, "El valor de la prenda superior no puede ser nulo");
    Preconditions.checkNotNull(inferior, "El valor de la prenda inferior no puede ser nulo");
    Preconditions.checkNotNull(calzado, "El valor del calzado no puede ser nulo");
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
  }
}
