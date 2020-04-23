
public interface CharacterInterface {
    public void getStats();
    public void getOffense();
    public int Attacking(int option);
    public String AttackingString(int option);

    // stats affected by XP
    public int Strength(int change);
    public int Sentience(int change);
    public int Spell(int change);
    
    // combat
    public int Health(int change);

}