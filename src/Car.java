//Udlæsning af currentSpeed, currentRpm, maxRpm, currentGear, odometer

public class Car {

    private String password;
    public boolean engineOn = false;
    public int speed = 0;
    public int currentGear = 1;
    public int rpm = 0;
    public int temperature;
    public boolean airconOn = false;
    public boolean heatOn = false;



    Car(){
        this.password = "pw:1234";
        this.engineOn = false;
        this.speed = 0;
        this.currentGear = 1;
        this.airconOn = false;
        this.heatOn = false;

    }

    void startEngine(CarKey key){
        Lights light1 = new Lights();
        if (key.password.equals(password)) {
            System.out.println("Bilen er tændt.");
            engineOn = true;
            light1.frontLightsOn = true;
            light1.backLightsOn = true;
            light1.turnLightsOn();
        } else {
            System.out.println("Bilen kan ikke tænde, pga. forkert nøgle.");
            light1.frontLightsOn = false;
            light1.backLightsOn = false;
            light1.turnLightsOff();
        }

    }

    void stopEngine(CarKey key1){
        Lights light1 = new Lights();
        if (key1.password.equals(password)) {
            System.out.println("Bilen er slukket.");
            engineOn = false;
            light1.frontLightsOn = false;
            light1.backLightsOn = false;
            light1.turnLightsOff();
        } else {
            System.out.println("Bilen kan køres");
            light1.frontLightsOn = true;
            light1.backLightsOn = true;
            light1.turnLightsOn();
        }
    }

    public int changeGearUp() {

        if(currentGear < 6 && currentGear > 0 && rpm >= 3000) {
            currentGear += 1;
            rpm -= 1500;
        }


        return currentGear;
    }

    public int changeGearDown() {

        if(currentGear < 6 && currentGear > 0 && rpm >= 1000) {
            currentGear -= 1;
            rpm += 2000;
        }

        return currentGear;
    }

    void accelerate() {

           if (speed < 200){
              speed += 20;
              rpm += 1000;

            System.out.printf("Nuværende hestighed er %d mph, RPM er %d og gear er ændret til %d \n"
                    , speed, rpm, changeGearUp());
        } else {
            System.out.println("Nuværende hestighed er maksimum");
        }

    }
      void decelerate(){
            if (speed >= 20) {
                speed -= 20;

                rpm -= 500;

                System.out.printf("Nuværende hestighed er %d mph, rpm er %d og gear er ændret til %d \n"
                        , speed, rpm, changeGearDown());

            }else{
                System.out.println("Bilen er allerede stoppet");
            }
        }

        void heatAndAirconOn(int tem) {
            temperature = tem;
            if (this.temperature >= 20) {
                airconOn = true;
                System.out.println("Aircondition er tændt  (temperature :" + tem + ")");
            } else {
                heatOn = true;
                System.out.println("Varmen er tændt (temperature :" + tem + ")");
            }
        }









    }







