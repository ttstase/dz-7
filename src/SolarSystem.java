public enum SolarSystem {
    MERCURY(1, 0, 58, 2439, null, "VENUS"),
    VENUS(2, 50, 50 + 58, 6052, "MERCURY", "EARTH"),
    EARTH(3, 40, 40 + 50 + 58, 6371, "VENUS", "MARS"),
    MARS(4, 39, 39 + 40 + 50 + 58, 3389, "EARTH", "JUPITER"),
    JUPITER(5, 55, 55 + 39 + 40 + 50 + 58, 69911, "MARS", "SATURN"),
    SATURN(6, 60, 60 + 55 + 39 + 40 + 50 + 58, 58232, "JUPITER", "URANUS"),
    URANUS(7, 25, 25 + 60 + 55 + 39 + 40 + 50 + 58, 25362, "SATURN", "NEPTUNE"),
    NEPTUNE(8, 15, 15 + 25 + 60 + 55 + 39 + 40 + 50 + 58, 24622, "URANUS", null);

    private final int num;
    private final int distanceFromPrevPlanet;
    private final int distanceFromSun;
    private final int radius;
    private final String prevPlanet;
    private final String nextPlanet;

    SolarSystem(int num, int distanceFromPrevPlanet, int distanceFromSun, int radius, String prevPlanet, String nextPlanet) {
        this.num = num;
        this.distanceFromPrevPlanet = distanceFromPrevPlanet;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.prevPlanet = prevPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getNum() {
        return num;
    }

    public int getDistanceFromPrevPlanet() {
        return distanceFromPrevPlanet;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public String getPrevPlanet() {
        return prevPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }

}
