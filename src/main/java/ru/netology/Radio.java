package ru.netology;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(){
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = minRadioStation;

        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentRadioStation = minVolume;
    }

    public Radio(int size1, int size2) {
        maxRadioStation = minRadioStation + size1 - 1;
        maxVolume = minVolume + size2;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    // возможность выставлять номер радиостанции через прямое указание её номера
    public void setCurrentRadioStation(int newSpecific) {
        if (newSpecific > maxRadioStation) {
            return;
        }
        if (newSpecific < minRadioStation) {
            return;
        }
        currentRadioStation = newSpecific;
    }

    // выбор следующуй радиостанции
    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }

        currentRadioStation += 1;
    }

    // выбор предыдущей радиостанции
    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation -= 1;
    }

    // выбор определенного уровня громкости
    public void setVolume(int newSpecific) {
        if (newSpecific > maxVolume) {
            newSpecific = maxVolume;
        }
        if (newSpecific < minVolume) {
            newSpecific = minVolume;
        }
        currentVolume = newSpecific;
    }

    // увеличение громкости
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    // уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }
}
