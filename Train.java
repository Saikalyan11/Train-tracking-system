public class Train {
    private int train_number;
    private Stations current_station;
    private Stations destination_station;

    public Train(int train_number, Stations current_station, Stations destination_station) {
        this.train_number = train_number;
        this.current_station = current_station;
        this.destination_station = destination_station;
    }

    public int getTrain_number() {
        return train_number;
    }

    public void setTrain_number(int train_number) {
        this.train_number = train_number;
    }

    public Stations getCurrent_station() {
        return current_station;
    }

    public void setCurrent_station(Stations current_station) {
        this.current_station = current_station;
    }

    public Stations getDestination_station() {
        return destination_station;
    }

    public void setDestination_station(Stations destination_station) {
        this.destination_station = destination_station;
    }

    public void move() {
        if (current_station.equals(destination_station)) {
            System.out.println("Your at your destination, Visit again");
        } else {
            System.out.println("Relax it's not your station");
        }
    }
}