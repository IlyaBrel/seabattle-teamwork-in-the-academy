package edu.javagroup.seabattle.service;

public interface PointService {

    void setShipPoint(char row, int col);
    boolean setSidePoint(String side, char row, int col, int value);
    boolean isClearPoint(char row, int col);
    boolean setBomb(char row, int col);
}

