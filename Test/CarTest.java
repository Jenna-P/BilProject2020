class CarTest {


    public static void main(String[] args) {
        testSuite();

    }

    private static void testSuite(){


        System.out.println("Testsuiten kører.");
        System.out.println("  Test 0 (Enum):");
        testEnum();
        System.out.println("  Test 1 (Bilen skal være tændt):");
        testStartEngine();
        System.out.println("  Test 2 (Gear skal skifte hvis hestigheden og rpm stiger) : ");
        testaccelerate();
        System.out.println("  Test 3 (Gear skal skifte ned hvis hestighed falder) : ");
        testdecelerate();
        System.out.println("  Test 4 (Aircon skal være tændt hvis temperature er over 20 grader" +
                "og varmen skal være tændt hvis temperature er under 20 grader) : ");
        testHeatAndAirconOn();
        System.out.println("  Test 5 (Bilen skal være slukket):");
        testStopEngine();
        System.out.println("  Test 6 (Wiper tænder hvis det regner eller sner):");
        testEnum1();
        testwiper();



    }

    private static void testStartEngine() {
        Car c1 = new Car();
        CarKey key = new CarKey("pw:1234");
        c1.startEngine(key);
    }

    private static void testStopEngine() {
        Car c1 = new Car();
        CarKey key = new CarKey("pw:1234");
        c1.stopEngine(key);
    }

    private static void testaccelerate() {

        Car c1 = new Car();
        c1.rpm = 2000;
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();


    }

    private static void testdecelerate() {
        Car c1 = new Car();
        c1.rpm = 1500;
        c1.speed = 80;
        c1.currentGear = 5;
        c1.decelerate();
        c1.decelerate();
    }

    private static void testHeatAndAirconOn() {
        Car c1 = new Car();
        c1.heatAndAirconOn(25);
        c1.heatAndAirconOn(10);
    }

    private  static void testwiper() {
        Wipers w1 = new Wipers();
        w1.wiper();

    }


    private static void testEnum() {
        System.out.println("Engine State" + EnumTest.EngineState.OFF);
        System.out.println("Min bilsfarve" + EnumTest.ColourOfMyCar.WHITE);
    }

    private static void testEnum1() {
        System.out.println("Vejret : " + EnumTest.Weather.valueOf("SNOWY"));
    }

}