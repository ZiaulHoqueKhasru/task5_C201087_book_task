package com.zio;

import org.w3c.dom.ls.LSOutput;

public class TotalPrice extends BookC201087 {
    public double tex=super.mainPrice()*2.0/100.0;
    //public double cost=tex+super.mainPrice()-super.fridayDiscount();
    public int add(int a,int b,int c)
    {
        return a+c-b;
    }
    public double add(int a,int b,double c)
    {
        return a+c-b;
    }






}
