package org.shzhong.generic;

public class Point<T>{// 此处可以随便写标识符号
    private T x ;        
    private T y ;        
    public void setX(T x){//作为参数  
        this.x = x ;  
    }  
    public void setY(T y){  
        this.y = y ;  
    }  
    public T getX(){//作为返回值  
        return this.x ;  
    }  
    public T getY(){  
        return this.y ;  
    }

    public static void main(String[] args) {

        Point<Integer> p1 = new Point<Integer>() ;
        p1.setX(100) ;
        System.out.println(p1.getX());

        Point<Float> p2 = new Point<Float>() ;
        p2.setX(100.12f) ;
        System.out.println(p2.getX());
    }
};