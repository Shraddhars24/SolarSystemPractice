public class SolarSystem {
    public static void main(String[] args) {
        BasicStructure BB = new BasicStructure();
        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";
        System.out.println("Solar System is ready");

        FeatureSun Xros = new FeatureSun();
        Xros.temp = "34324K";
        Xros.Color = "green";
        Xros.Radius = "1000000km";

        Planet2 Earth = new Planet2("Moon", "Sun", "Planets", "Stars");
        System.out.println("Earth has " + Earth.getMoon() + ", " + Earth.getSun() + ", " + Earth.getPlanets() + ", " + Earth.getStars());


    }
}
