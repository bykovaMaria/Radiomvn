public class Radio {
    private final int stationAmount;
    private int currentStation;
    private int currentVolume;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public Radio() {
        stationAmount = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation <= stationAmount - 1) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
    }

    public void nextStation() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0) {
            if (newVolume <= 100) {
                currentVolume = newVolume;
            }
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}