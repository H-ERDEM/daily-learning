public class CharacterFactory {
    public static GameCharacter createCharacter(String type, String name) {
        switch (type) {
            case "warrior":
                return new Warrior(name);
            case "mage":
                return new Mage(name);
            default:
                System.out.println("Hata: Bilinmeyen karakter tipi!");
                return null;
        }
    }
}