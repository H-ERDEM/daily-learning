class Herbivore extends Animal {
    public int grassRequired;
    public Herbivore(String name, int age, int animalld, boolean isFed, int grassRequired){
        super(name, age, animalld, isFed);
        this.grassRequired=grassRequired;
    }
    @Override
    public void feedAnimal() {

        if (grassStock < grassRequired) {
            int neededed = grassRequired - grassStock;

            System.out.println(getName() + " beslenemedi ");
            System.out.println("Gerekli ot: " + grassRequired + "g");
            System.out.println("Mevcut stok: " + grassStock + "g");
            System.out.println("Eksik miktar: " + neededed + "g");
        } else {
            grassStock -= grassRequired;
            setFed(true);

            System.out.println(getName() + " beslendi ");
            System.out.println(grassRequired + "g ot kullanıldı");
        }
}

}

