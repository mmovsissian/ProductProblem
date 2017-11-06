package com.company;

import java.util.Iterator;
import java.util.List;

public class Director {
    List <Class> Classes;

    public Director() {
        Classes = Class.getClasses();
    }

    void removeClass(){
        this.Classes.forEach(s -> {
            Iterator<Class> P =this.Classes.iterator();
            while (P.hasNext()) {
                if (P.next().getApprCount()==5) {
                    P.remove();
                }}
    });}

    void changeHead(Class Class, HeadTeacher HeadTeacher){
        Class.setHeadteacher(HeadTeacher);
    }


    void complete(){
        Class.getClasses().forEach(s -> {
            if (s.getClassNumber()==12){
                System.out.println("Class number "+s.getClassNumber()+"completed school"+s.getHeadteacher().toString()); }

        });



    }










}
