public class ConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura ct = new ConversorTemperatura();

        double temp = ct.fahrenheitToCelsius(10);

        System.out.println("La temperatura fahrenheit a celsius es: " + temp);
    }

    /*
    //Metodos que hacen la conversion de grados fahrenheit a celsius
    //y de celsius a fahrenheit
     */

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = ((fahrenheit - 32.0) * 5.0)/9.0;
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9.0/5.0) + 32.0;
        return fahrenheit;
    }
}
