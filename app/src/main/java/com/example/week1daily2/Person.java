package com.example.week1daily2;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String carYear;
    private String carMake;
    private String carModel;
    private String carColor;
    private String carEngine;
    private String carTransmission;


    public Person() {
    }

    public Person(String carYear, String carMake, String carModel, String carColor, String carEngine, String carTransmission) {
        this.carYear = carYear;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.carTransmission = carTransmission;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }

    protected Person(Parcel in) {
        carYear = in.readString();
        carMake = in.readString();
        carModel = in.readString();
        carColor = in.readString();
        carEngine = in.readString();
        carTransmission = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }


}
