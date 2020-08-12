package com.pokemon.api;

import java.awt.Point;

public class Board {

    private static Point moveNorth(Point prevPosition) {
        return new Point(prevPosition.x, prevPosition.y+1);
    }

    private static Point moveSouth(Point prevPosition) {
        return new Point(prevPosition.x, prevPosition.y-1);
    }

    private static Point moveEast(Point prevPosition) {
        return new Point(prevPosition.x+1, prevPosition.y);
    }

    private static Point moveWest(Point prevPosition) {
        return new Point(prevPosition.x-1, prevPosition.y);
    }

    public static Point move(Point currentPosition, char direction) {
        Point newPosition;
        switch (direction) {
            case 'N':
                newPosition = moveNorth(currentPosition);
                break;
            case 'S':
                newPosition = moveSouth(currentPosition);
                break;
            case 'E':
                newPosition = moveEast(currentPosition);
                break;
            case 'O':
                newPosition = moveWest(currentPosition);
                break;
            default:
                newPosition = null;
                break;
        }
        return newPosition;
    }
}
