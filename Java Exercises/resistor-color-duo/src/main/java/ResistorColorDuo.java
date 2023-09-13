import java.util.*;

class ResistorColorDuo 
{
    private HashMap<String, String> colorCodes = new HashMap<String, String>();

    public ResistorColorDuo()
    {
        this.colorCodes.put("black", "0");
        this.colorCodes.put("brown", "1");
        this.colorCodes.put("red", "2");
        this.colorCodes.put("orange", "3");
        this.colorCodes.put("yellow", "4");
        this.colorCodes.put("green", "5");
        this.colorCodes.put("blue", "6");
        this.colorCodes.put("violet", "7");
        this.colorCodes.put("grey", "8");
        this.colorCodes.put("white", "9");
    }
    
    int value(String[] colors) 
    {
        String value = "";
        for(int i = 0; i < 2; i++)
        {
            value += this.colorCodes.get(colors[i]);
        }
        return Integer.parseInt(value);
    }
}
