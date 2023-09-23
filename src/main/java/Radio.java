public class Radio {

    private int currentVolume;//Текущая громкость.

    private int currentRadioStation;//Текущая радиостанция.


    public int getCurrentVolume() {//Запрос данных.
        return currentVolume;
    }

    public int getCurrentRadioStation() {//Запрос данных.
        return currentRadioStation;
    }

    public void switchingVolumePlus() {//Переключение громкости на одну единицу выше.
        int target = currentVolume + 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void switchingVolumeMinus() {//Переключение громкости на одну единицу ниже.
        int target = currentVolume - 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void switchingRadioStationsPlus() {//Переключение радиостанций на одну единицу выше.
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void switchingRadioStationsMinus() {//Переключение радиостанций на одну единицу ниже.
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void setCurrentVolume(int newCurrentVolume) {//Изменение данных.
        if (newCurrentVolume < 0) {//Проверка, что громкость не меньше установленной, если меньше, то установка будет невозможной.
            return;
        }
        if (newCurrentVolume > 100) {//Проверка, что громкость не больше установленной, если больше, то установка будет невозможной.
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {//Изменение данных.
        if (newCurrentRadioStation < 0) {//Проверка, что радиостанция не меньше установленной, если меньше, то установка будет невозможной.
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {//Проверка, что радиостанция не больше установленной, если больше, то установка будет невозможной.
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMaxRadioStation() {//Максимальный номер радиостанции.
        currentRadioStation = 9;
    }

    public void setToMaxVolume() {//Максимальная громкость.
        currentVolume = 100;
    }

}