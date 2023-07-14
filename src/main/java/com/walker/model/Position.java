package com.walker.model;

public record Position(int x, int y, int z) {

    @Override
    public String toString(){
        return "[%d, %d, %d]".formatted(x, y, z);
    }
}
