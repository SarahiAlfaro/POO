
public class Main {

	public static void main(String[] args) {
		
		Tacos taco3 = new Tacos("Masa Azul","Suadero", 2, "Mediana", 30f);
		System.out.println(taco3.toString());
		/*
		Tacos taco1 = new Tacos();
		taco1.tipoDeTortilla = "Masa azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla = 2;
		taco1.tamanioDeTortilla = "Mediana";
		taco1.precio = 30;
		taco1.subirPrecio(5.5f);
		System.out.println(taco1.toString());
		
		Tacos taco2 = new Tacos();
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 42.6f;
		taco2.tipoDeTortilla = "Trigo";
		System.out.println(taco2.toString());
		*/
		
		//Se usó el encapsulamiento
		Tacos taco4 =new Tacos("Maiz");
		System.out.println(taco4.toString());
		
		Tacos taco5 = new Tacos();
		taco5.setNumeroDeTortilla(2);
		taco5.setPrecio(55.5f);
		taco5.setTamanioDeTortilla("Grande");
		taco5.setTipoDeGuisado("Pastor");
		taco5.setTipoDeTortilla("Maíz");
		System.out.println(taco5.toString());
	}

}
