public class Radio {

    public void SwitchingVolumePlus(){//Переключение громкости на одну единицу выше.
        int target = currentVolume + 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void SwitchingVolumeMinus(){//Переключение громкости на одну единицу ниже.
        int target = currentVolume - 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }
    public int currentVolume;//Текущая громкость.

    public int getCurrentVolume(){//Запрос данных.
        return  currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume){//Изменение данных.
        if (newCurrentVolume < 0){//Проверка, что громкость не меньше установленной, если меньше, то установка будет невозможной.
            return;
        }
        if (newCurrentVolume > 100){//Проверка, что громкость не больше установленной, если больше, то установка будет невозможной.
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void SetToMaxVolume(){//Максимальная громкость.
        currentVolume = 100;
    }


    //------------------------------working with radio stations------------------------------------------

    public void SwitchingRadioStationsPlus(){//Переключение радиостанций на одну единицу выше.
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void SwitchingRadioStationsMinus(){//Переключение радиостанций на одну единицу ниже.
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }
    public int currentRadioStation;//Текущая радиостанция.

    public int getCurrentRadioStation(){//Запрос данных.
        return  currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){//Изменение данных.
        if (newCurrentRadioStation < 0){//Проверка, что радиостанция не меньше установленной, если меньше, то установка будет невозможной.
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9){//Проверка, что радиостанция не больше установленной, если больше, то установка будет невозможной.
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void SetToMaxRadioStation(){//Максимальный номер радиостанции.
        currentRadioStation = 9;
    }


}
