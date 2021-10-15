
public class Player {
	private String name;
	Weapon w1;
	public Player(String name)
	{
		this.name = name;
	}
	public void SetWeapon(Weapon weapon)
	{
		this.w1 = weapon;
	}
	public void Action()
	{
		w1.Attack();
	}
}
