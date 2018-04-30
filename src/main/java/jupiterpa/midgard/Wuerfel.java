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

    public int extended (int anzahl, int wuerfel, int bonus)
    {
        int rueckgabe = 0;
        for (int i = 0; i < anzahl; i++)
        {
           rueckgabe += this.wuerfel (wuerfel);
        }
        rueckgabe += bonus;
        if (rueckgabe < 0)
            rueckgabe = 0;
        return rueckgabe;
    }
}