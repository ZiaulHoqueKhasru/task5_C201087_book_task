package com.zio;

public class BookC201087 extends Price
{

    @Override
    int mainPrice() {
        int price=1087;

        System.out.println("totla price is "+price);
        return price;
    }

    @Override
    int fridayDiscount() {
        int discount= 87;
        System.out.println("Congratulation You got Friday Discount!");
        return discount;
    }



    private String BookName;
    public String bookWriterId;
    public String bookWriter;
    BookC201087()
    {
        bookWriterId="C201087";
        bookWriter="Md.Ziaul Hoque";

    }

    public  String getName()//getter
    {
        return BookName;
    }
    public void setName(String name)//setter
    {
        this.BookName=name;//here this keyword refers to BookC201087 class
    }

}
