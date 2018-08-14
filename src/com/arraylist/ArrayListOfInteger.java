package com.arraylist;

public class ArrayListOfInteger{

    private int[] vector;
    private int size;

    public ArrayListOfInteger(){
        vector = new int[10];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int element) {
        if(isEmpty()){
            return false;
        }else {
            for(int value : vector){
                if(value == element){
                    return  true;
                }
            }
            return false;
        }
    }

    public void add(int element) {

        if(size == vector.length - 1){
            AddVectorSpace();
        }

        vector[size] = element;
        size++;

    }

    public boolean remove(int element) {

        if(isEmpty()){
            return  false;
        }

        if(size == 1 && vector[0] == element){
            clear();
        }

        for(int i = 0; i < size; i++){

            if(vector[i] == element){
                for(int d = i; d < (size-1); d++){
                    vector[d] = vector[d+1];
                }
                size--;
                return  true;
            }

        }

        return false;
    }

    public void clear() {
        vector = new int[10];
        size = 0;
    }

    private void AddVectorSpace(){

        int[] auxVet = new int[vector.length + 10];

        for(int i = 0; i < size; i++){
            auxVet[i] = vector[i];
        }

        vector = auxVet;
    }

}
