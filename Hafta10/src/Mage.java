class Mage extends GameCharacter {
    private int mana = 100;

    public Mage(String name) {
        super(name);
        System.out.println("Karakter oluşturuldu: Mage, ID: " + getId() + ", Seviye: " + getLevel());
    }

    @Override
    public void attack() {
        System.out.println(getName() + " karakteri büyü saldırısı yapıyor!");
    }
}