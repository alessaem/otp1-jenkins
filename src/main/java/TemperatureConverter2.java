public class TemperatureConverter2 {

    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }

    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius*9/5+32;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double celsius){
        if(celsius > 50 || celsius < -40 ){
            return true;
        }
        return false;
    }

    public double kelvinToCelsius(double kelvin){
        double celsius = kelvin-273.15;
        return celsius;
    }
}
