package com.company;

public class HeadTeacher {
    String name;
    String surname;
    char    gender;

    public HeadTeacher(String name, String surname, char gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    void addNewAppr(Apprentice Apprentice){
        Class.getClasses().forEach(s -> {
            if (s.getHeadteacher().equals(this)){
                s.getApprenticeList().add(Apprentice); }

        });

    }



    void removeDowager(){
        Class.getClasses().forEach(s -> {
            if (s.getHeadteacher().equals(this)){
                for (int i = 0; i < s.getApprenticeList().size(); i++) {
                    if (s.getApprenticeList().get(i).getStyduStatus().equals("dowager")){
                        s.getApprenticeList().remove(i);
                    }
                } }
        });
    }



    void setMog(Apprentice Apprentice, int mog){
        Class.getClasses().forEach(s -> {
            if (s.getHeadteacher().equals(this)){
                for (int i = 0; i < s.getApprenticeList().size(); i++) {
                    if (s.getApprenticeList().get(i).equals(Apprentice)){
                        s.getApprenticeList().get(i).setMog(mog);
                    }
                } }
        });
    }








}
