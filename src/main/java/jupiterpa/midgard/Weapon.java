package jupiterpa.midgard;

public class Weapon
{
    private int attackBonus;
    private String description;
    private String damageCode;

    public Weapon (int attackBonus, String description, String damageCode)
    {
        this.attackBonus = attackBonus;
        this.description = description;
        this.damageCode = damageCode;
    }

    public int getAttackBonus ()
    {
        return this.attackBonus;
    }

    public String getDescription ()
    {
        return this.description;
    }

    public String getDamageCode ()
    {
        return this.damageCode;
    }
}