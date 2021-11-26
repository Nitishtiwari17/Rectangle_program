package com.company;
class rectangle
{
    int length;
    int width;
    void insert(int i,int w)
    {
        length=i;
        width=w;
    }
    void display()
    {
        System.out.println(length*width);
    }
   }

public class Main {

    public static void main(String[] args)
        {
            rectangle s1=new rectangle();
            rectangle s2=new rectangle();
            s1.insert(25,24);
            s2.insert(24,24);
            s1.display();
            s2.display();
	// write your code here
    }
}
