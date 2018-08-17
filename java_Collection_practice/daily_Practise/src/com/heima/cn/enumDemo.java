package com.heima.cn;


public class enumDemo {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
//        if(dir == Direction.EAST){
//            System.out.println("Direction: EAST");
//        }else if(dir == Direction.WEST){
//            System.out.println("Direction: West");
//        }else if(dir == Direction.SOUTH){
//            System.out.println("Direction: south");
//        }else {
//            System.out.println("Direction: north");
//        }
        System.out.println(dir.getDirectionCode());
        for (Direction dr: Direction.values()) {
            System.out.println(dr);
            System.out.println(dr.getDirectionCode());
        }
        System.out.println(Direction.EASTDirections.valueOf("EAST_SOUTH"));
    }
}

