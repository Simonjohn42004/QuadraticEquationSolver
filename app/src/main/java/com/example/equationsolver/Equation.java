package com.example.equationsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.equationsolver.databinding.ActivityMainBinding;

public class Equation extends BaseObservable {
    private String a;
    private String b;
    private String c;
    ActivityMainBinding binding;
    public Equation(ActivityMainBinding binding) {
        this.binding = binding;
    }
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    public void solveEquation(View v){
        double a= Double.parseDouble(getA());
        double b= Double.parseDouble(getB());
        double c= Double.parseDouble(getC());

        double d= b*b-4*a*c;
        double x1,x2;
        if(d<0){

            binding.Finalanswertext.setText("No Real Roots");
        }
        else if(d==0){
            x1= -b/ (2*a);
            binding.Finalanswertext.setText("x1= "+ x1);
        }
        else {
            x1 = (-b+ Math.sqrt(d))/ 2*a;
            x2 = (-b- Math.sqrt(d))/ 2*a;
            binding.Finalanswertext.setText("X1= "+ x1 + " X2= "+ x2);
        }
    }

    public Equation() {
    }

}
