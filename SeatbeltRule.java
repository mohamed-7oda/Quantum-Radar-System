public class SeatbeltRule implements Rule {

    @Override
    public Violation check(Observation observation) {

        if (!observation.isSeatbeltFastened()) {
            return new Violation("Seatbelt not fastened", 100);
        }

        return null;
    }

    @Override
    public String getRuleName() {
        return "Seatbelt Rule";
    }
}