public class Dalek1 {

    private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
        batteryCharge += c;
        System.out.println("Battery Charge is " + batteryCharge);
    }

    public void move(int distance) {

            for (int i = 0; i < distance; i++){

                if (batteryCharge >= 0.5){

                    batteryCharge -= 0.5;
                    System.out.print("[" + (i + 1) + "] ");

                } else {

                    System.out.println("Out of Power!");
                    break;

                }
            }
    }

}