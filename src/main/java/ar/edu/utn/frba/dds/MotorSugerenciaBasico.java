package ar.edu.utn.frba.dds;

import java.util.List;

public class MotorSugerenciaBasico implements MotorSugerencias {
  public List<Prenda> getPrendasValidas(Usuario usuario) {
    return usuario.getPrendas();
  }
}
