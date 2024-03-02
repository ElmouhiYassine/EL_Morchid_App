package com.example.al_morchid;

import android.os.Parcel;
import android.os.Parcelable;

public class Ville implements Parcelable {
    private int imageResourceId;
    private String nom;
    private String description;
    private String position;

    public Ville(int imageResourceId, String nom, String description, String position) {
        this.imageResourceId = imageResourceId;
        this.nom = nom;
        this.description = description;
        this.position = position;
    }

    protected Ville(Parcel in) {
        imageResourceId = in.readInt();
        nom = in.readString();
        description = in.readString();
        position = in.readString();
    }

    public static final Creator<Ville> CREATOR = new Creator<Ville>() {
        @Override
        public Ville createFromParcel(Parcel in) {
            return new Ville(in);
        }

        @Override
        public Ville[] newArray(int size) {
            return new Ville[size];
        }
    };

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageResourceId);
        dest.writeString(nom);
        dest.writeString(description);
        dest.writeString(position);
    }
}



