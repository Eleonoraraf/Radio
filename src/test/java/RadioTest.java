import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void SwitchingVolumeToOnePlus(){//Переключение громкости на одну единицу выше
        Radio Radio = new Radio();
        Radio.setCurrentVolume(100);

        Radio.SwitchingVolumePlus();

        int expected = 100;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingVolumeToOneMinus(){//Переключение громкости на одну единицу ниже
        Radio Radio = new Radio();
        Radio.setCurrentVolume(0);

        Radio.SwitchingVolumeMinus();

        int expected = 0;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() { //установка громкости.
        Radio Radio = new Radio();

        Radio.setCurrentVolume(6);//Тестируемое действие:задать номер громкости.

        int expected = 6;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume(){//Максимальная громкость.
        Radio Radio = new Radio();

        Radio.SetToMaxVolume();//Тестируемое действие:Установка максимальной громкости.

        int expected = 100;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax(){//Не должна быть больше максимальной громкости.
        Radio Radio = new Radio();

        Radio.setCurrentVolume (100);//Тестируемое действие:Установка выше максимальной громкости.

        int expected = 100;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin(){//Не должна быть меньше минимальной громкости.
        Radio Radio = new Radio();

        Radio.setCurrentVolume (0);//Тестируемое действие:Установка меньше минимальной громкости.

        int expected = 0;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    //------------------------------working with radio stations------------------------------------------

    @Test
    public void SwitchingRadioStationsToOnePlus(){//Переключение радиостанций на одну единицу выше
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(8);

        Radio.SwitchingRadioStationsPlus();

        int expected = 9;
        int actual = Radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingRadioStationsToOneMinus(){//Переключение радиостанций на одну единицу ниже
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(0);

        Radio.SwitchingRadioStationsMinus();

        int expected = 9;
        int actual = Radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation() { //установка радиостранции.
        Radio Radio = new Radio();

        Radio.setCurrentRadioStation(6);//Тестируемое действие:задать номер радиостанции.

        int expected = 6;
        int actual = Radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation(){//Максимальная радиостанция.
        Radio Radio = new Radio();

        Radio.SetToMaxRadioStation();//Тестируемое действие:Установка максимальной радиостанции.

        int expected = 9;
        int actual = Radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax(){//Не должна быть больше максимальной радиосанции.
        Radio Radio = new Radio();

        Radio.setCurrentRadioStation (11);//Тестируемое действие:Установка выше максимальной радиостанции.

        int expected = 0;
        int actual = Radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationAboveMin(){//Не должна быть меньше минимальной радиосанции.
        Radio Radio = new Radio();

        Radio.setCurrentRadioStation (0);//Тестируемое действие:Установка меньше минимальной радиостанции.

        int expected = 0;
        int actual = Radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
