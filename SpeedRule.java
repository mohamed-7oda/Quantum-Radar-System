public class SpeedRule implements Rule {

    @Override
    public Violation check(Observation observation) {

        int maxSpeed = Integer.MAX_VALUE;

        if (observation.getCarType().equalsIgnoreCase("Truck"))
            maxSpeed = 60;

        else if (observation.getCarType().equalsIgnoreCase("Private"))
            maxSpeed = 80;

        if (observation.getSpeed() > maxSpeed) {
            return new Violation(
                    "speed of " + observation.getSpeed()
                            + " exceeded max allowed " + maxSpeed,
                    300);
        }

        return null;
    }

    @Override
    public String getRuleName() {
        return "Speed Rule";
    }
}