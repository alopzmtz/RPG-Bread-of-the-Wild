package botw;

public class Player implements Character{

	private String name;
	private int hp;
	private double dmg, dfs, amr;
	// private Weapons wpn;
	//private Items itm

	public Player(String name, int hp, double dmg, double dfs, double amr){	
		this.name = name;
		this.hp = hp;
		this.dmg = dmg;
		this.dfs = dfs;
		this.amr = amr;
		//this.wpn = wpn;
		//this.itm = tim;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setLife(int hp){
		this.hp = hp;
	}
	public int getLife(){
		return hp;
	}

	public void setDamage(double dmg){
		this.dmg = dmg;
	}
	public double getDamage(){
		return dmg;
	}

	public void setDefense(double dfs){
		this.dfs = dfs;
	}
	public double getDefense(){
		return dfs;
	}

	public void setArmor(double amr){
		this.amr = amr;
	}
	public double getArmor(){
		return amr;
	}

	/*public void setWeapon(Weapons wpn){
		this.wpn = wpn;
	}
	public Weapons getWeapon(){
		return wpn;
	}*/

	/*public void setWeapon(Weapons itm){
		this.itm = itm;
	}
	public Weapons getWeapon(){
		return itm;
	}*/

}