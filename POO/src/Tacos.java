
public class Tacos {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = 0.0f;
	
	//Se pueden utilizar múltiples constructores, depende de los parámetros que se pasen
	// es el constructor al que va a entrar
	public Tacos () {
		
	}
	
	public Tacos (String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	//El constructor nos ayuda a inicializar objetos
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, 
			String tamanioDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio (float aumento) {
		precio = precio + aumento;
	}
	
	

	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortilla>0 && numeroDeTortilla<=2) {
			this.numeroDeTortilla = numeroDeTortilla;
		} else {
			throw new IllegalArgumentException("El número de torillas no es válido");
			
		}
		//this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if(precio>0 && precio<=80) {
			this.precio = precio;
		} else {
			throw new IllegalArgumentException("El precio es excesivo");
			
		}
		//this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
}
