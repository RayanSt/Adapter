package personajes;




public class FabricaConcretaGuerreros extends FabricaAbstractaPersonaje {



	@Override
	public PersonajeAbstracto getPersonaje() {
		return new Guerrero();
	
	}

}
