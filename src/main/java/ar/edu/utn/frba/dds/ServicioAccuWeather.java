package ar.edu.utn.frba.dds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements ServicioClimatico {
  @Override
  public Temperatura obtenerTemperaturaActualEnLaCiudad(String ciudad) {
    AccuWeatherApi apiClima = new AccuWeatherApi();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
    HashMap temperature = (HashMap) condicionesClimaticas.get(0).get("Temperature");
    Temperatura temperatura = new Temperatura(
        (Integer) temperature.get("Value"),
        temperature.get("Unit") == "F" ? Unidad.FARENHEIT : Unidad.CELSIUS
    );

    return temperatura;
  }
}
