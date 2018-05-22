package model;

import annotation.GenInspectionResult;
import annotation.GenTramWorkerId;
import io.dummymaker.annotation.complex.GenTime;
import io.dummymaker.annotation.simple.string.GenPhrase;

import java.sql.Timestamp;

public class HistoryOfInspection {

    @GenTramWorkerId(from = 1, to = 1000)
    public int tramId;

    @GenTime(from = 1510010008, to = 1529010008)
    public Timestamp day;

    @GenInspectionResult
    public String result;

    @GenPhrase
    public String comment;
}
