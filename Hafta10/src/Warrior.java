class Warrior extends GameCharacter {
    private int strength = 50;

    public Warrior(String name){
        super(name);



        System.out.println("Karakter oluşturuldu: Warrior, ID: " + getId() + ", Seviye: " + getLevel());
    }

    @Override
    public void attack() {
        System.out.println(getName() + " karakteri fiziksel saldırı yapıyor!");
    }
}

