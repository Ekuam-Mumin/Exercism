public class Lasagna 
{
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMin)
    {
        return (this.expectedMinutesInOven() - actualMin);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers)
    {
        return (layers * 2);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int ovenTime)
    {
        return (this.preparationTimeInMinutes(layers) + ovenTime);
    }
}
