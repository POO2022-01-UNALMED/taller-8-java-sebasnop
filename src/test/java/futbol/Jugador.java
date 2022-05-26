package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Object f) {
		if (this.getEdad() >= ((Futbolista )f).getEdad()) {
			return this.getEdad() - ((Futbolista )f).getEdad();
		} else {
			return ((Futbolista )f).getEdad() - this.getEdad();
		}
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	public String toString() {
		return "El futbolista "+ getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + getDorsal() + ". Ha marcado " + getGolesMarcados();
	}
	
}
