package topic_04_JavaFX_PropertiesBindings.petExercise.v2;



public class PetModel {
	private Pet currentPet;
	
	public void savePet(Pet.Species species, Pet.Gender gender, String name) {
		currentPet = new Pet(species, gender, name);
	}
	
	public void deletePet() {
		currentPet = null;
	}
	
	public Pet getPet() {
		return currentPet;
	}
}
