package model;

import annotation.GenTramWorkerId;
import io.dummymaker.annotation.complex.GenTime;
import io.dummymaker.annotation.simple.string.GenId;
import io.dummymaker.annotation.simple.string.GenNick;
import io.dummymaker.annotation.simple.string.GenPhrase;

import java.sql.Timestamp;

public class HistoryOfRepairwork {

    @GenTramWorkerId(from = 1, to = 1000)
    public int tramId;

    @GenTime(from = 1516410008, to = 1516510008)
    public Timestamp repairstarted;

    @GenTime(from = 1516520008, to = 1516550008)
    public Timestamp repairfinished;

    @GenPhrase
    public String description;

    @GenId
    public int expenses;

    @GenNick
    public String responsible;
}
