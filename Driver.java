public class Driver {
    public static void main(String[] args) {
        Superhero spiderMan = new Superhero("Spider-Man");
        Superhero superMan = new Superhero("Superman");
        Superhero ironMan = new Superhero("Iron Man");
        Superhero thor = new Superhero("Thor");
        Superhero hulk = new Superhero("Hulk");

        Superhero[] marvel = {spiderMan, superMan, ironMan, thor, hulk};
        for(int i = 0; i < marvel.length; i++){
            System.out.print(marvel[i] + ", ");
        }

        System.out.println("\nArray will be sorted.");

        Superhero[] sortedArray = ComicBookBin.mergeSortHeroes(marvel);
        for(int i = 0; i < marvel.length; i++){
            System.out.print(sortedArray[i] + ", ");
        }
    }
}
