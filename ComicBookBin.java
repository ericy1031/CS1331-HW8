public class ComicBookBin{
    public static Superhero[] mergeSortHeroes(Superhero[] heroes) {
        if (heroes.length <= 1) {
            return heroes;
        }

        int mid = heroes.length / 2;
        Superhero[] left = RecursionUtils.copyOfRange(heroes, 0, mid);
        Superhero[] right = RecursionUtils.copyOfRange(heroes, mid, heroes.length);

        left = mergeSortHeroes(left);
        right = mergeSortHeroes(right);

        return RecursionUtils.merge(left, right);
    } 

    public static Superhero[] mergeHeroes(Superhero[][] teams) {
        if (teams.length == 0) {
            
        }

        Superhero[] outputList = new Superhero[1];

        return outputList;
    }

    public static Superhero[] heroesOfAlliance(Superhero[] heroes) {
        Superhero[] outputList = new Superhero[heroes.length];

        return outputList;
    }

    public static double mergeHeroes(Superhero[] heroes) {
        double strength = 0;

        return strength;
    }

    public static void flip(Superhero[] heroes) {

    }
}