package main.java.yaksha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner br=new Scanner(System.in);
        CinemaTicket ticket=new CinemaTicket();
        System.out.println("Enter the no of ticket:");
        int no=br.nextInt();
        if(no<5 || no>40){
            /* You code Here */  
        }
        else{
        	  
    		 System.out.println("Do you want refreshment:[y/n]");
             String ref=br.next();
             System.out.println("Do you have coupon code:[y/n]");
             String cou=br.next();
             System.out.println("Enter the circle:");
             String cir=br.next();
             if(cir.equalsIgnoreCase("k")||cir.equalsIgnoreCase("q")) {
             	/* You code Here */  
             }else {
            	/* You code Here */  
             }
                 
             
        }
	}
}
