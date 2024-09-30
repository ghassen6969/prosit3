public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal duplicateLion = new Animal("Felidae", "Lion", 6, true); // Doublon

        Zoo myZoo = new Zoo("Safari Park", "Paris");

        // Ajouter des animaux au zoo
        System.out.println(myZoo.addAnimal(lion)); // true
        System.out.println(myZoo.addAnimal(tiger)); // true
        System.out.println(myZoo.addAnimal(duplicateLion)); // false (doublon)

        // Afficher les animaux
        myZoo.displayAnimals();

        // Tester la recherche d'animaux
        System.out.println(myZoo.searchAnimal(lion)); // Indice de Lion
        System.out.println(myZoo.searchAnimal(duplicateLion)); // -1 (doublon)

        // Supprimer un animal et vérifier
        myZoo.removeAnimal(lion);
        System.out.println(myZoo.searchAnimal(lion)); // -1 (non trouvé)
        myZoo.displayAnimals();

        // Vérifier si le zoo est plein
        System.out.println(myZoo.isZooFull()); // false

        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Wild Park", "Lyon");
        anotherZoo.addAnimal(tiger); // Ajouter un animal
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Zoo avec le plus d'animaux: " + biggerZoo.name);
    }
}
