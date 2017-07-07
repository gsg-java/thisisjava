package nnew;
import nnew.Interface.Calculatable;

class Calculator implements Calculatable {
    int num1, num2, num3;

    public void number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void number(int num1, int num2, int num3){ //overloading
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public void sum() {
        System.out.println(this.num1 + this.num2 + this.num3);
    }
    
    public void avg() {
    	if(this.num3==0){
    		System.out.println((this.num1 + this.num2) / 2);
    	}
    	else{System.out.println((this.num1 + this.num2 + this.num3) / 3);}
    }
}

class Substract extends Calculator { //inheritance

    public void substract() { 
        System.out.println(this.num1 - this.num2 - this.num3);
    }

    @Override
    public void sum() { //overwriting
    	if(this.num1%2==0){
    		super.sum();
    	}
    	else{System.out.println("Result: "+ (this.num1 + this.num2 + this.num3));}
    }
}