class Carnivore extends Animal {
    private int meatRequired;
    public Carnivore(String name, int age, int animalld, boolean isFed, int meatRequired) {
        super(name,age,animalld,isFed);

        this.meatRequired = meatRequired;
    }
    @Override
    public void feedAnimal() {

        if (meatStock < meatRequired) {
            int needed = meatRequired - meatStock;
            System.out.println(getName() + " beslenemedi ");
            System.out.println("Gerekli et: " + meatRequired + "g");
            System.out.println("Mevcut stok: " + meatStock + "g");
            System.out.println("Eksik miktar: " + needed + "g");
        } else {
            meatStock -= meatRequired;
            setFed(true);
            System.out.println(getName() + " beslendi ");
            System.out.println(meatRequired + "g et kullanıldı");
        }
    }
}