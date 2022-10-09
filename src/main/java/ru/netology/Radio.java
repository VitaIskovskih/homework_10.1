package ru.netology;

public class Radio {
    private int radioStation = 0;

    private int volume = 5;

    public int getRadioStation() {
        return radioStation;
    }

    public int getVolume() {
        return volume;
    }

    // возможность выставлять номер радиостанции через прямое указание её номера
    public void setRadioStation(int newSpecific) {
        if (newSpecific > 9) {
            return;
        }
        if (newSpecific < 0) {
            return;
        }
        radioStation = newSpecific;
    }

    // выбор следующуй радиостанции
    public void nextRadioStation() {
        if (radioStation == 9) {
            radioStation = 0;
            return;
        }

        radioStation += 1;
    }

    // выбор предыдущей радиостанции
    public void prevRadioStation() {
        if (radioStation == 0) {
            radioStation = 9;
            return;
        }
        radioStation -= 1;
    }

    // выбор определенного уровня громкости
    public void setVolume(int newSpecific) {
        if (newSpecific > 10) {
            newSpecific = 10;
        }
        if (newSpecific < 0) {
            newSpecific = 0;
        }
        volume = newSpecific;
    }

    // увеличение громкости
    public void increaseVolume() {
        if (volume < 10) {
            volume += 1;
        }
    }

    // уменьшение громкости
    public void decreaceVolume() {
        if (volume > 0) {
            volume -= 1;
        }
    }
}
