public abstract class GameCharacter {
    private String name;
    private String id;
    private int healty;
    private int level;
    public static int amount=1;
    public GameCharacter(String name) {
        this.id = getId();
        this.name = name;
        this.healty = healty;
        this.level = level;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getHealty() {
        return healty;

    }
    public void setHealty(int healty) {
        this.healty = healty;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();
    public void displayStats(){
        System.out.println("isim "+name +"level"+level+"Can seviyesi"+healty);
    }
    public void heal (int amount){
        if(amount > 0){
            healty += amount;
        } else {
            System.out.println("HATA!!!!");
        }
    }
    public void takeDamage(int amount){
        if(amount > 0){
            healty -= amount;
        } else{
            System.out.println("HATA!!!!");
        }
    }
    public String generateCharacterId(){
        int rand = (int) (Math.random()*100);
        String  newstr = Integer.toString(rand);
        this.id = newstr;
        return   ("CHR-"+id);
    }

}
