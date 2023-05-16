package ar.edu.utn.frba.dds;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public interface MotorSugerencias {

  List<Prenda> getPrendasValidas(Usuario usuario);
  default List<Sugerencia> generarSugerencias(Usuario usuario) {
    //Se usa default para no repetir logica (Con la ayuda del metodo de getPrendasValidas)
    List<Prenda> prendasSuperiores = this.getPrendasValidas(usuario).stream().filter(p -> p.esSuperior()).collect(Collectors.toList());
    List<Prenda> prendasInferiores = this.getPrendasValidas(usuario).stream().filter(p -> p.esInferior()).collect(Collectors.toList());
    List<Prenda> calzados = this.getPrendasValidas(usuario).stream().filter(p -> p.esCalzado()).collect(Collectors.toList());
    //Uso una biblioteca como Guava para el producto cartesiano
    List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).collect(Collectors.toList());
  }
}
