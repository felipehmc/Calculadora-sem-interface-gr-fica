/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author felip
 */
public class Calculator {
    int value;
    int keep;
    char toDo;
    void Operation (char op){
        keep = value;
        value = 0;
        toDo = op;
    }
    void add(){Operation('+');}
    void subtract(){Operation('-');}
    void multiply(){Operation('*');}
    void divide(){Operation('/');}
    void compute(){
        if(toDo == '+')
            value = keep + value;
        if(toDo == '-')
            value = keep - value;
        if(toDo == '*')
            value = keep*value;
        if(toDo =='/')
            value = keep/value;
        keep = 0;
    }
    void clear(){
        value = 0;
        keep = 0;
    }
    void digit(int x){
        value = value*10 + x;
    }
    int display(){
        return value;
    }
    Calculator(){clear();}
    
    public static void main(String[] args) {
        Calculator C1 = new Calculator();
        C1.digit(4);
        C1.digit(6);
        C1.add();
        C1.digit(3);
        C1.digit(1);
        C1.compute();
        System.out.println(C1.display());
    }
    
}
