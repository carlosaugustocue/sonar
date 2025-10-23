package conversor;

import java.util.logging.Logger;

public class ConversorTemperatura {
    private static final Logger LOGGER = Logger.getLogger(ConversorTemperatura.class.getName());

    public static void main(String[] args) {
        double temp = fahrenheitToCelsius(10);
        LOGGER.log(java.util.logging.Level.INFO,
                "La temperatura fahrenheit a celsius es: {0}", temp);
    }

    /**
     * Convierte grados Fahrenheit a Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32.0) * 5.0) / 9.0;
    }

    /**
     * Convierte grados Celsius a Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}