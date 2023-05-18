package ar.edu.utn.frba.dds;

public class ProveedorDeServicioClimatico {
  static ServicioClimatico servicioClimatico;

  static ServicioClimatico getServicioClimatico(){
    return servicioClimatico;
  }

  static void setServicioClimatico(ServicioClimatico servicioClimatico){
    ProveedorDeServicioClimatico.servicioClimatico = servicioClimatico;
  }

  //Un administrador deberia acceder a esta clase estatica y setear
  //el servicio climatico que quiera.
  //Ejemplo: ProveedorDeServicioClimatico.setServicioClimatico(servicioAccuWeather);
}
