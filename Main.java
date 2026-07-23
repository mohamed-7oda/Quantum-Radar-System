import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        QuRadar radar = new QuRadar();

        radar.addRule(new SpeedRule());
        radar.addRule(new SeatbeltRule());

        radar.observe(new Observation(
                "ABC1234",
                LocalDate.now(),
                "Private",
                94,
                false
        ));

        radar.observe(new Observation(
                "TRK555",
                LocalDate.now(),
                "Truck",
                55,
                true
        ));

        radar.observe(new Observation(
                "TRK888",
                LocalDate.now(),
                "Truck",
                80,
                false
        ));

        radar.getAllPossibleFines();

        System.out.println();

        radar.printViolatedRulesCount();
    }
}