public class NullPet extends Pet {
    public NullPet() {
        super.setName("Unassigned");
        super.setBirthDate(LocalDate.now());
    }
}
