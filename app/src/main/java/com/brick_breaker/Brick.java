package com.brick_breaker;

public class Brick {
    private boolean isVisible;
    public int row,column,width,height;
    public Brick(int row,int column,int width,int height){
        isVisible = true;
        this.row = row;
        this.column=column;
        this.width=width;
        this.height=height;
    }
    public  void setInvisible(){
        isVisible=false;
    }
    public  boolean getVisibility(){
        return  isVisible;
    }
    public void setVisibility(boolean isVisible){
        this.isVisible = isVisible;
    }
}
