package com.company;

import com.sun.tools.internal.jxc.gen.config.Classes;

import java.util.ArrayList;
import java.util.List;

public class Class {
    int classNumber;
    int apprCount;
    int classRoom;
    HeadTeacher Headteacher;
    List<Apprentice> ApprenticeList;
    static List<Class> Classes = new ArrayList<>();

    public Class(int classNumber, int apprCount, int classRoom, HeadTeacher headteacher, List<Apprentice> apprenticeList) {
        this.classNumber = classNumber;
        this.apprCount = apprCount;
        this.classRoom = classRoom;
        Headteacher = headteacher;
        ApprenticeList = apprenticeList;
        Classes.add(this);}


    public HeadTeacher getHeadteacher() {
        return Headteacher;
    }

    public List<Apprentice> getApprenticeList() {
        return ApprenticeList;
    }

    public static List<Class> getClasses() {
        return Classes;
    }

    public int getApprCount() {
        return apprCount;
    }

    public void setHeadteacher(HeadTeacher headteacher) {
        Headteacher = headteacher;
    }

    public int getClassNumber() {
        return classNumber;
    }
}
