package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {

    //тесты выбора радиостанций через прямое указание её номера

    @Test
    public void currentRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNumber1() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNumber2() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // тест выбора следующей радиостанции
    @Test
    public void nextStationNumber1() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.nextRadioStation();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }

    @Test
    public void nextStationNumber2() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }

    // тест выбора предыдущей радиостанции
    @Test
    public void prevStationNumber() {
        Radio radio= new Radio();
        radio.setRadioStation(2);
        radio.prevRadioStation();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }

    @Test
    public void prevStationNumber1() {
        Radio radio= new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }

    // тесты выбора определенного уровня громкости
    @Test
    public void certainVolume1() {
        Radio radio = new Radio();
        radio.setVolume(5);
        int expected = 5;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void certainVolume2() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void certainVolume3() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тесты увеличения громкости
    @Test
    public void setVolumeMax1() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseVolume();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    public void setVolumeMax2() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    // тест уменьшения громкости
    @Test
    public void setVolumeMin1() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaceVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMin2() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaceVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
