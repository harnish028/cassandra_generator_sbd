package model;

import annotation.GenTramWorkerId;
import io.dummymaker.annotation.complex.GenTime;
import io.dummymaker.annotation.simple.time.GenDate;

import java.sql.Timestamp;

public class HistoryOfWorktime {

    @GenTramWorkerId(from = 1, to = 1000)
    public int workerId;

    @GenDate
    public String day;

    @GenTramWorkerId(from = 1, to = 1000)
    public int tramId;

    @GenTime(from = 1516410008, to = 1516510008)
    public Timestamp start;

    @GenTime(from = 1516450008, to = 1516530008)
    public Timestamp finish;
}
