package ar.edu.utn.frba.dds;

public class ProveedorDeServicioClimatico {
  static ServicioClimatico servicioClimatico;

  static ServicioClimatico getServicioClimatico(){
    return servicioClimatico;
  }

  static void setServicioClimatico(ServicioClimatico servicioClimatico){
    ProveedorDeServicioClimatico.servicioClimatico = servicioClimatico;
  }
}
