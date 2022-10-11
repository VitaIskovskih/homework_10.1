package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {
    @Test
    public void test1() {
        Radio cond = new Radio(10, 100);

        Assertions.assertEquals(0, cond.getMinRadioStation());
        Assertions.assertEquals(9, cond.getMaxRadioStation());
        Assertions.assertEquals(0, cond.getCurrentRadioStation());

        Assertions.assertEquals(0, cond.getMinVolume());
        Assertions.assertEquals(100, cond.getMaxVolume());
        Assertions.assertEquals(0, cond.getCurrentRadioStation());
    }

    @Test
    public void test2() {
        Radio cond = new Radio();

        Assertions.assertEquals(0, cond.getMinRadioStation());
        Assertions.assertEquals(9, cond.getMaxRadioStation());
        Assertions.assertEquals(0, cond.getCurrentRadioStation());

        Assertions.assertEquals(0, cond.getMinVolume());
        Assertions.assertEquals(100, cond.getMaxVolume());
        Assertions.assertEquals(0, cond.getCurrentRadioStation());
    }

    //Тесты выбора радиостанции и уровня звука
    @Test
    public void currentRadioStationNumber1() {
        Radio radio = new Radio(10, 100);

        radio.setCurrentRadioStation(5);
        int expected1 = 5;
        int actual1 = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected1, actual1);

        radio.setVolume(5);
        int expected2 = 5;
        int actual2 = radio.getCurrentVolume();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void currentRadioStationNumber2() {
        Radio radio = new Radio(10, 100);

        radio.setCurrentRadioStation(20);
        int expected1 = 0;
        int actual1 = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected1, actual1);

        radio.setVolume(120);
        int expected2 = 100;
        int actual2 = radio.getCurrentVolume();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void currentRadioStationNumber3() {
        Radio radio = new Radio(10, 100);

        radio.setCurrentRadioStation(-1);
        int expected1 = 0;
        int actual1 = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected1, actual1);

        radio.setVolume(-1);
        int expected2 = 0;
        int actual2 = radio.getCurrentVolume();
        Assertions.assertEquals(expected2, actual2);
    }

    // тест выбора следующей радиостанции и повышение звука
    @Test
    public void nextStationNumber1() {
        Radio radio = new Radio(10, 100);

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        int expected1 = 1;
        Assertions.assertEquals(expected1, radio.getCurrentRadioStation());

        radio.setVolume(0);
        radio.increaseVolume();
        int expected2 = 1;
        Assertions.assertEquals(expected2, radio.getCurrentVolume());
    }

    @Test
    public void nextStationNumber2() {
        Radio radio = new Radio(10, 100);

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

        radio.setVolume(200);
        radio.increaseVolume();
        int expected2 = 100;
        Assertions.assertEquals(expected2, radio.getCurrentVolume());
    }

    // тест выбора предыдущей радиостанции и понижение звука
    @Test
    public void prevStationNumber() {
        Radio radio= new Radio(10, 100);

        radio.setCurrentRadioStation(2);
        radio.prevRadioStation();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

        radio.setVolume(5);
        radio.decreaseVolume();
        int expected2 = 4;
        Assertions.assertEquals(expected2, radio.getCurrentVolume());
    }

    @Test
    public void prevStationNumber1() {
        Radio radio= new Radio(10, 100);

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

        radio.setVolume(0);
        radio.decreaseVolume();
        int expected2 = 0;
        Assertions.assertEquals(expected2, radio.getCurrentVolume());
    }
}
