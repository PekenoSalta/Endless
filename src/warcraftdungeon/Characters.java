/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraftdungeon;

/**
 *
 * @author Alberto Rey Moreno
 * Endless Pre-Alpha v1.00
 */
public class Characters {

	private String name;
	// private String clase;
	private int fuerza = (int) Math.floor(Math.random() * 4) + (7);
	private int defensa = (int) Math.floor(Math.random() * 7);
	private int life = 10;

	public Characters(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	} */
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;

	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public void showCH() {

		System.out.println("--- HOJA DE PERSONAJE ---");
		System.out.println("name: " + this.getName());
		System.out.println("Fuerza: " + this.getFuerza());
		System.out.println("Defensa: " + this.getDefensa());
		System.out.println("life: " + this.getLife());

	}
	
	public boolean beAlive() {

		boolean res = false;
		if (this.getLife() > 0) {
			res = true;
		}

		return res;

	}

	public void ataca (Characters ch) {
        
        int damage;
        
        if ((int) Math.floor(Math.random()*4) == 0) {
            damage = this.fuerza - ch.getDefensa();
            ch.setLife(ch.getLife() - damage);
            System.out.println("Se tira un dado de cuatro caras... Cae y " + this.name + " acierta por lo que ataca a " + ch.getName());
            System.out.println(this.name + " ataca y le hace " + damage + " a " + ch.getName() + " dejandolo malherido y con solo " + ch.getLife() + " puntos de life.");
            System.out.println("---------------------------------------------");
            
            if (!ch.beAlive()) {
                System.out.println(ch.name + " ha sido machacado.");
            }
            
        } else {
            System.out.println("El ataque de " + this.name + " ha fallado.");
            System.out.println("---------------------------------------------");
        }
        
               
    }
	
	

}

