package ar.edu.utn.frba.dds;

public class ProveedorDeServicioClimatico {
  private static ServicioClimatico servicioClimatico;

  public static ServicioClimatico getServicioClimatico() {
    return servicioClimatico;
  }

  public static void setServicioClimatico(ServicioClimatico servicioClimatico) {
    ProveedorDeServicioClimatico.servicioClimatico = servicioClimatico;
  }

  //Un administrador deberia eder a esta clase estatica y setear
  //el servicio climatico que quiera.
  //Ejemplo: ProveedorDeServicioClimatico.setServicioClimatico(serviciouWeather);
}
