package model;

import annotation.GenIncident;
import annotation.GenTramWorkerId;
import io.dummymaker.annotation.complex.GenTime;
import io.dummymaker.annotation.simple.string.GenPhrase;

import java.sql.Timestamp;

public class HistoryOfIncident {

    @GenTramWorkerId(from = 1, to = 1000)
    public int tramId;

    @GenTime(from = 1510010008, to = 1529010008)
    public Timestamp day;

    @GenIncident
    public String incident;

    @GenPhrase
    public String description;
}
