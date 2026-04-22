public class Main {
    public static void main(String[] args) {
        // Karakterleri Factory üzerinden oluşturuyoruz
        GameCharacter c1 = CharacterFactory.createCharacter("warrior", "Arthur");
        GameCharacter c2 = CharacterFactory.createCharacter("mage", "X");

        if (c1 != null && c2 != null) {
            // Saldırıları gerçekleştir
            c1.attack();
            c2.attack();

            // Örnek çıktıdaki gibi can ekleme işlemi
            c2.heal(30);

            // İstatistikleri kontrol etme (Opsiyonel)
            // c1.displayStats();
        }
    }
}