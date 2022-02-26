package com.company;

public class Main {

    public static void main(String[] args) {

        int x =10;
        int y =20;

        int n = 7;

        Main obj = new Main();

        int area_of_rectangle = obj.area(x, y);
        float area_of_circle = obj.area(n);

        System.out.println("area_of_rectangle : "+ area_of_rectangle);
        System.out.println("area_of_circle : "+ area_of_circle);

    }

    public int area(int n1, int n2){
        int result = n1*n2;
        return result;
    }
    public float area(int n){
        float result = 3.14f*n*n;
        return result;
    }
}
