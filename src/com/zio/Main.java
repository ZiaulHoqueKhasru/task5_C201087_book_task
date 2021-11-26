package com.zio;

public class Main extends BookC201087  {

    public static void main(String[] args) {

    BookC201087 obj=new BookC201087();

    obj.setName("Zio Biography");
        System.out.println("the Book You want is"+' '+obj.getName());

        TotalPrice cost =new TotalPrice();
        System.out.println(obj.getName()+' '+"book author name is "+obj.bookWriter);
        System.out.println(obj.getName()+' '+"book author id is "+obj.bookWriterId);
        System.out.println("You have to pay total : "+cost.add(obj.mainPrice(),obj.fridayDiscount(),cost.tex)+"taka where "+cost.tex+" tax added");
        System.out.println("Enjoy The Book:) ");

    }
}
