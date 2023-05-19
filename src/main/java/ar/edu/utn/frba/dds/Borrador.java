package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.TipoDePrenda.*;

import ar.edu.utn.frba.dds.Excepciones.ColorException;
import ar.edu.utn.frba.dds.Excepciones.MaterialException;
import ar.edu.utn.frba.dds.Excepciones.TipoException;
import ar.edu.utn.frba.dds.Excepciones.TramaException;
import com.google.common.base.Preconditions;
import java.text.Normalizer;
import java.util.List;

public class Borrador {

  private Color colorPrincipal;
  private Color colorSecundario;
  private Material material;
  private TipoDePrenda tipo;
  private Trama trama;

  private Categoria categoria;

  private Formalidad formalidad;

  private Integer temperaturaMaximaAdecuada;


  public void especificarColorPrincipal(Color colorPrincipal) {
    Preconditions.checkNotNull(colorPrincipal, "El color principal no puede ser nulo");
    this.colorPrincipal = colorPrincipal;
  }

  public void especificarColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void especificarMaterial(Material material) {
    Preconditions.checkNotNull(material, "El material no puede ser nulo");
    this.validarMaterialConsistenteConTipoDePrenda(material);
    this.material = material;
  }

  public void especificarTipo(TipoDePrenda tipo) {
    Preconditions.checkNotNull(tipo, "El tipo no puede ser nulo");
    this.tipo = tipo;
  }

  public void especificarTrama(Trama trama) {
    this.trama = trama == null ? Trama.LISA : trama;
  }

  public void especificarCategoria(Categoria categoria) {
    Preconditions.checkNotNull(categoria, "La categoria no puede ser nula");
    this.categoria = categoria;
  }

  public void especificarFormalidad(Formalidad formalidad){
    Preconditions.checkNotNull(formalidad, "La formalidad no puede ser nula");
    this.formalidad = formalidad;
  }

  public void especificarTemperaturaMaximaAdecuada(Integer temperaturaMaximaAdecuada){
    Preconditions.checkNotNull(temperaturaMaximaAdecuada, "La temperatura maxima adecuada no puede ser nula");
    this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
  }

  public Prenda crearPrenda(){
    return new Prenda(colorPrincipal,colorSecundario,material,tipo,trama, categoria,formalidad,temperaturaMaximaAdecuada);

  }


  private void validarMaterialConsistenteConTipoDePrenda(Material material) {
    //TODO hacer mas lindo sin ifs por que es un asco
    List<TipoDePrenda> tiposDePrendaValidasParaElAlgodon = List.of(REMERA,CAMISA,
        PANTALON,SACO,CAMPERA,SHORT,POLLERA);
    List<TipoDePrenda> tiposDePrendaValidasParaElPique = List.of(SACO,REMERA,CHOMBA);
    List<TipoDePrenda> tiposDePrendaValidasParaElAcetato = List.of(SACO,CAMPERA, PANTALON,POLLERA);
    List<TipoDePrenda> tiposDePrendaValidasParaLaLona = List.of(ZAPATILLAS);
    List<TipoDePrenda> tiposDePrendaValidasParaElCuero = List.of(CAMPERA,ZAPATOS,POLLERA,PANTALON);

    if (material.equals(Material.ALGODON) && !tiposDePrendaValidasParaElAlgodon.contains(tipo)){
      throw new MaterialException("Material no valido para el tipo de prenda");
    }
    if (material.equals(Material.PIQUE) && !tiposDePrendaValidasParaElPique.contains(tipo)){
      throw new MaterialException("Material no valido para el tipo de prenda");
    }
    if (material.equals(Material.ACETATO) && !tiposDePrendaValidasParaElAcetato.contains(tipo)){
      throw new MaterialException("Material no valido para el tipo de prenda");
    }
    if (material.equals(Material.LONA) && !tiposDePrendaValidasParaLaLona.contains(tipo)){
      throw new MaterialException("Material no valido para el tipo de prenda");
    }
    if (material.equals(Material.CUERO) && !tiposDePrendaValidasParaElCuero.contains(tipo)){
      throw new MaterialException("Material no valido para el tipo de prenda");
    }
    return;
  }

  public Borrador(TipoDePrenda tipo) {
    Preconditions.checkNotNull(tipo,"El tipo de prenda no puede ser nulo");
    this.tipo = tipo;
  }
}
