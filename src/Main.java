public class Main {
    public static void main(String[] args) {
        SolarSystem solar = SolarSystem.valueOf("SATURN");
        System.out.println(solar.getNum());
        System.out.println(solar.getDistanceFromPrevPlanet());
        System.out.println(solar.getDistanceFromSun());
        System.out.println(solar.getRadius());
        System.out.println(solar.getPrevPlanet());
        System.out.println(solar.getNextPlanet());

    }

}
