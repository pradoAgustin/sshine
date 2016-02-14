package com.example.agustin.sunshine.presentacionLayer.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by agustin on 07/09/15.
 * better to use Parcelable , Does not use Reflection to serialize
 */
public class ForeCastDayly  implements Parcelable{
    String description;
    String date;
    double tempMorning;
    double tempEve;
    double tempNight;
    double max;
    double low;

    public ForeCastDayly(Parcel source) {
        description=source.readString();
        date=source.readString();
        tempMorning=source.readDouble();
        tempEve=source.readDouble();
        tempNight=source.readDouble();
    }
    public ForeCastDayly(){}

    public String getDate() {
        return date;
    }

    public String getTempEve() {
        return String.valueOf(tempEve);
    }

    public String getTempMorning() {
        return String.valueOf(tempMorning);
    }

    public String getTempNight() {
        return String.valueOf(tempNight);
    }

    public String getMax() {
        return String.valueOf(max);
    }

    public double getLow() {
        return low;
    }
    public String getDescription() {

        return description;
    }


    public String basicState(){
        return date+", "+description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(description);
        dest.writeString(date);
        dest.writeDouble(tempMorning);
        dest.writeDouble(tempEve);
        dest.writeDouble(tempNight);


    }

    public static final Parcelable.Creator<ForeCastDayly> CREATOR = new Creator<ForeCastDayly>() {
        @Override
        public ForeCastDayly createFromParcel(Parcel source) {

            return new ForeCastDayly(source);
        }

        @Override
        public ForeCastDayly[] newArray(int size) {
            return new ForeCastDayly[size];
        }
    };
}
