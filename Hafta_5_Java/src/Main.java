//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {

        public static void main(String[] args) {

            Carnivore lion = new Carnivore("Aslan", 5, 1200,false,300);
            Herbivore deer = new Herbivore("Geyik", 3, 800,false,200);

            lion.showStock();

            lion.feedAnimal();
            deer.feedAnimal();
            lion.generateAnimalId(1200);
            deer.generateAnimalId(800);
            lion.checkStatus();
            deer.checkStatus();

            lion.showStock();

    }

}
