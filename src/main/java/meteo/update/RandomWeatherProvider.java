// trzeba dostosować do wersji z Weather Provider

package meteo.update;

import meteo.WeatherData;
import meteo.locations.Locations;
import net.aksingh.owmjapis.model.param.Weather;

import java.util.List;
import java.util.Random;

/**
 * Created by Matt on 11.09.2018 at 19:22.
 */

public class RandomWeatherProvider implements WeatherProvider {


    public WeatherData getWeatherData(Locations location) {

        Random random = new Random();

        String localisation = location.getName();
        double windSpeed = random.nextInt(30);
        double temperature = random.nextInt(30);
        double pressure = 960 + random.nextInt(90);
        double humidity = random.nextInt(100);
        double cloudCover = random.nextInt(100);
        List<Weather> overall = null;
        String description = "random conditions";

        return new WeatherData(localisation, temperature, windSpeed, pressure, humidity, cloudCover, overall,
                description);
    }


}
