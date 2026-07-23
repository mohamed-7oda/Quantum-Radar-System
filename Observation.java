import java.time.LocalDate;

public class Observation {
    private String plateNumber;
    private LocalDate date;
    private String carType;
    private int speed;
    private boolean seatbeltFastened;

    public Observation(String plateNumber, LocalDate date, String carType,
                       int speed, boolean seatbeltFastened) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCarType() {
        return carType;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isSeatbeltFastened() {
        return seatbeltFastened;
    }
}