package personajes;




public class FabricaConcretaEnanos extends FabricaAbstractaPersonaje {

    @Override
	public PersonajeAbstracto getPersonaje() {
		return new Enanos();
	
	}
    
}



