public class Animal {
    private String name;
    private int age;
    private int animalld;
    private boolean isFed;

    protected static int meatStock =1000;
    protected static int grassStock=1000;

    public Animal(String name, int age, int animalld, boolean isFed) {
        this.name = name;
        this.age = age;
        this.animalld = animalld;
        this.isFed =isFed;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public int getAnimalld(){
        return animalld;
    }
    public boolean isFed(){
        return isFed;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAnimalld(int animalld){
        this.animalld = animalld;
    }

    public void setFed(boolean isFed){
        this.isFed = isFed;
    }

    public String generateAnimalId (int animalld) {
        int rand = (int) (Math.random()*100);
        this.animalld = rand;

        String idstring= Integer.toString(animalld);
        return   ("ANL-"+idstring);
    }
    public void showStock(){
        System.out.println("et stoğu"+ meatStock + "|" +"ot stoğu " +grassStock);
    }

    public void feedAnimal() {
        System.out.println("Besleme işlemi her canlıya özgü sınıflarda tanımlanmalıdır");
    }

    public Boolean checkStatus(){
        if(isFed==true){
            return true;
        }
        else{
            return false;
        }
    }

      }




