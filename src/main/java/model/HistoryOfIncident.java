package model;

import annotation.GenIncident;
import io.dummymaker.annotation.complex.GenTime;
import io.dummymaker.annotation.simple.number.GenInteger;
import io.dummymaker.annotation.simple.string.GenPhrase;

import java.sql.Timestamp;

public class HistoryOfIncident {

    @GenInteger
    public int trumId;

    @GenTime(from = 1510010008, to = 1529010008)
    public Timestamp day;

    @GenIncident
    public String incident;

    @GenPhrase
    public String description;
}
