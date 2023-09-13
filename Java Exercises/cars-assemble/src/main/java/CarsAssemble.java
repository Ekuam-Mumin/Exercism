import java.util.*;

public class CarsAssemble 
{
    public static void main(String[] args) 
    {
        CarsAssemble carsAssemble = new CarsAssemble();
        System.out.println(carsAssemble.productionRatePerHour(7));
    }

    public double productionRatePerHour(int speed) 
    {
        if(speed >= 1 && speed <= 4) return (speed * 221);
        if(speed >= 5 && speed <= 8) return (speed * 221 * 0.9);
        if(speed == 9) return (speed * 221 * 0.8);
        if(speed == 10) return (speed * 221 * 0.77);
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) 
    {
        return ((int)this.productionRatePerHour(speed))/60;
    }
}