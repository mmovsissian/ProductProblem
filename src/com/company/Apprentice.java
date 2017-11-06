package com.company;

public class Apprentice {
    String name;
    String surname;
    char    gender;
    int mog;
    String  styduStatus;


    public Apprentice(String name, String surname, char gender, int mog) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.mog = mog;

        if (this.mog<=10){this.styduStatus="dowager";}
        if (this.mog>10&&this.mog<=20){this.styduStatus="average student";}
        if (this.mog>20){this.styduStatus="high achiever";}
    }

    public int getMog() {
        return mog;
    }

    public String getStyduStatus() {
        return styduStatus;
    }

    public void setMog(int mog) {
        this.mog = mog;
    }

}
