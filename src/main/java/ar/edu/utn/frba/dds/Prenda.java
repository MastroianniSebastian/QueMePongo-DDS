package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Excepciones.ColorException;
import ar.edu.utn.frba.dds.Excepciones.MaterialException;
import ar.edu.utn.frba.dds.Excepciones.TipoException;

public class Prenda {
  private String nombre; //El nombre es el nombre que le quiera poner el usuario a la prenda
  private Color colorPrincipal;
  private Color colorSecundario;
  private Material material;
  private Tipo tipo;

  public Prenda(String nombre, Color colorPrincipal, Material material, Tipo tipo) {

    if(colorPrincipal == null){
      throw new ColorException("El color principal no puede ser un valor nulo");
    }
    if(material == null){
    throw new MaterialException("El material no puede ser un valor nulo");
    }
    if(tipo == null){
    throw new TipoException("El ti´po no puede ser un valor nulo");
    }

    this.nombre = nombre;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.tipo = tipo;
  }

  public Tipo getTipo() {
    return tipo;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
