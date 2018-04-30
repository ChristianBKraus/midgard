package jupiterpa.midgard;

public class Wuerfel
{
    public Wuerfel() {}

    public int wuerfel (int wuerfel)
    {
        switch (wuerfel)
        {
            case 2: return (int) (Math.random() * 2) + 1;
            case 3: return (int) (Math.random() * 3) + 1;
            case 6: return (int) (Math.random() * 6) + 1;
            case 20: return (int) (Math.random() * 20) + 1;
            case 100: return (int) (Math.random() * 100) + 1;
            default: return 0;
        }
    }
}