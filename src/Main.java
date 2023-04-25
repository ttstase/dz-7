public class Main {
    public static void main(String[] args) {
        SolarSystem mercury = SolarSystem.MERCURY;
        SolarSystem venus = SolarSystem.VENUS;
        SolarSystem earth = SolarSystem.EARTH;
        SolarSystem mars = SolarSystem.MARS;
        SolarSystem jupiter = SolarSystem.JUPITER;
        SolarSystem saturn = SolarSystem.SATURN;
        SolarSystem uranus = SolarSystem.URANUS;
        SolarSystem neptune = SolarSystem.NEPTUNE;


        System.out.println(uranus.getNum());
        System.out.println(uranus.getDistanceFromPrevPlanet());
        System.out.println(uranus.getDistanceFromSun());
        System.out.println(uranus.getRadius());
        System.out.println(uranus.getPrevPlanet());
        System.out.println(uranus.getNextPlanet());

    }

}
