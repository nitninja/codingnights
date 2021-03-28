package com.codingnights;

public class main {
    public static void main(String[] args){
cat kayt=new cat("meme","white",4,true);

bird japanesebird=new bird("canery","yellow",2,true,"2");
        System.out.println(japanesebird.getWings());
        System.out.println(japanesebird.getName());
        System.out.println(japanesebird.getColor());
        japanesebird.eat("worms");
        cat pompy =new cat("tilu","brown",4,true);
        pompy.eat("chicken");
        System.out.println(pompy.getName());
        System.out.println(pompy.isHastail());

    }
}

