package com.kodnest.methods.methodoverloading;

public class Disneychai {
          public static void main(String[]args) {
		    	 teaBill();
		    	 teaBill(10);
		    	 teaBill("Ginger");
		    	 teaBill("Green",10);
		     }
		     public static void teaBill()
		     {
		    	 System.out.println("Bill for tea is 10RS");
		     }
		     public static void teaBill(int n)
		     {
		    	 System.out.println("Bill for" +n+ "tea is"+(n*10)+"RS");
		     }
		     public static void teaBill(String type)
		     {
		    	 System.out.println("Bill for"+type+"tea is 15RS");
		     }
		     public static void teaBill(String type,int n)
		     {
		    	 System.out.println("Bill for"+n+" "+type+"tea is"+(n*15));
		     }
		     
		     
		}
