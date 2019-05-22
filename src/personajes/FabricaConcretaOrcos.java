package personajes;




public class FabricaConcretaOrcos extends FabricaAbstractaPersonaje {

	@Override
	public PersonajeAbstracto getPersonaje() {
		
		return new Orcos();
	}

}

