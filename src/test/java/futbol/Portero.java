package futbol;

public class Portero extends Futbolista {
	
	public short golesRecibidos;
	public byte dorsal;
	
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public Portero() {
		this("Ter Stegen", 28, (short) 0, (byte) 1);
	}
	

	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	
	public String toString() {
		return "El futbolista " + getNombre() + " tiene "+ getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado "+ golesRecibidos;
	}


	@Override
	public int compareTo(Futbolista f) {
		if (this.getGolesRecibidos() >= ((Portero) f).getGolesRecibidos()) {
			return this.getGolesRecibidos() - ((Portero) f).getGolesRecibidos();
		} else {
			return ((Portero) f).getGolesRecibidos() - this.getGolesRecibidos();
		}
	}



	@Override
	public boolean jugarConLasManos() {
		return true;
	}

}
