package ar.edu.utn.frba.dds;

import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements ServicioClimatico{
  @Override
  public Integer obtenerTemperaturaActualEnLaCiudad(String ciudad) {
    //AccuWeatherAPI apiClima = new AccuWeatherAPI();
    //List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);
   // condicionesClimaticas.get(0).get("PrecipitationProbability");
    ciudad= "Buenos Aires, Argentina";
    AccuWeatherAPIMock apiClima = new AccuWeatherAPIMock();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
    //TODO Hacer mock para probar y evitar incurrir en costos innecesarios

    return (Integer) condicionesClimaticas.get(0).get("Temperature");git sgit 
  }
}
