package com.heima.cn;

public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code){
        this.shortCode = code;
    }

    public String getDirectionCode(){
        return this.shortCode;
    }

    public enum EASTDirections{
        EAST_NORTH,
        EAST_SOUTH
    }
}
