/*
    The moon’s gravity is about 17 percent that of earth’s. Write a program that
    computes your effective weight on the moon.
*/
class MoonWeight {
    public static void main(String args[]) {
        double my_weight, moon_weight;
        my_weight = 75;
        moon_weight = my_weight * 0.17;
        System.out.println("My Weight on Moon: "+moon_weight);
    }
}