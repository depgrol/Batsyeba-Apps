package com.latihan.batsyeba;


import android.os.Parcel;
import android.os.Parcelable;

// Tanggal Pengerjaan : 21 Mei 2019
// NIM : 10116096
// NAMA : AA SUHENDAR
// KELAS : IF-3 / AKB-3

public class Member implements Parcelable {

    private int id;
    private String name;
    private String team;
    private int thumb;

    public Member() {
    }

    protected Member(Parcel in) {
        id = in.readInt();
        name = in.readString();
        team = in.readString();
        thumb = in.readInt();
    }

    public static final Creator<Member> CREATOR = new Creator<Member>() {
        @Override
        public Member createFromParcel(Parcel in) {
            return new Member(in);
        }

        @Override
        public Member[] newArray(int size) {
            return new Member[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(team);
        dest.writeInt(thumb);
    }
}