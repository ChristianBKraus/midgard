package jupiterpa.midgard;
import java.util.*;

public class Monster
{
    private String id;
    private String type;
    private int ap;
    private int lp;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    public Monster (String id, String t, int a, int l, Weapon[] weps)
    {
        this.id = id;
        this.type = t;
        this.ap = a;
        this.lp = l;
        for (int i = 0; i < weps.length; i++)
        {
            this.weapons.add (weps[i]);
        }
    }

    public String attack (String weap_desc)
    {
        Weapon weapon = null;
        Wuerfel wuerfel = new Wuerfel ();
        int attackResult;
        int damageResult;

        // Waffe raussuchen
        for (int i = 0; i < weapons.size (); i++)
        {
            if (weapons.get(i).getDescription().equals (weap_desc))
            {
                weapon = weapons.get (i);
            }
        }

        // Fehler-Vorsorge
        if (weapon == null)
        {
            return "Falsche Waffe!";
        }

        // Angriffswurf
        attackResult = wuerfel.extended (1, 20, weapon.getAttackBonus());
        if (attackResult < 20)
        {
            return "Nicht getroffen!";
        }

        // Schadenswurf
        damageResult = wuerfel.damage (weapon.getDamageCode());

        // Ergebnis zurückgeben
        return "Angriff: " + Integer.toString (attackResult) + 
        ", Schaden: " + Integer.toString (damageResult) + ".";
    }
}