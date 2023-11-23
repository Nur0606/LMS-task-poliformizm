public class Main {
    public static void main(String[] args) {
Animal[] animals={
        new Shark(),
        new Turtle(),
        new Eagle(),
};
        for (Animal animal : animals) {
            animal.AnimalMethothot();
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
            }
            if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
            }
            if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }
        }


    }
}