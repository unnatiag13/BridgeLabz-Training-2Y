package com.gla.dsa;

public class Stack {
    int[] arr;
    int top ;
    int size;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top=-1;
    }

    private void resize(){
        int curr_size = size*2;
        int[] Narr = new int[curr_size];
        for(int i=0;i<size;i++){
            Narr[i] = arr[i];
        }
        arr= Narr;
        size = curr_size;
    }

    void push(int x){
        if(top==size-1){
//            System.out.println("Stack Overflow");
//            return;
            resize();
        }
        arr[top] = x;
        top++;
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}


