package ru.netology;

import com.beust.ah.A;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {
    @Test
    public void test1() {
        Radio cond = new Radio();

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
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(5);
        int expected1 = 5;
        int actual1 = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void currentRadioStationNumber2() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(20);
        int expected1 = 0;
        int actual1 = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void currentRadioStationNumber3() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(-1);
        int expected1 = 0;
        int actual1 = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected1, actual1);
    }

    // тест выбора следующей радиостанции и повышение звука
    @Test
    public void nextStationNumber1() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        int expected1 = 1;
        Assertions.assertEquals(expected1, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationNumber2() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // тест выбора предыдущей радиостанции и понижение звука
    @Test
    public void prevStationNumber() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(2);
        radio.prevRadioStation();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationNumber1() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // тесты выбора уровня громкости
    @Test
    public void volumeLevelSelection1() {
        Radio radio = new Radio();

        radio.setVolume(5);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelSelection2() {
        Radio radio = new Radio();

        radio.setVolume(110);
        int expected = 100;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelSelection3() {
        Radio radio = new Radio();

        radio.setVolume(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    // тесты увеличить громкость
    @Test
    public void turnUpTheVolume1() {
        Radio radio = new Radio();

        radio.setVolume(3);
        radio.increaseVolume();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void turnUpTheVolume2() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    // тесты уменьшения громкости
    @Test
    public void turnDownTheVolume1() {
       Radio radio = new Radio();

       radio.setVolume(6);
       radio.decreaseVolume();
       int expected = 5;
       Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void turnDownTheVolume2() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
