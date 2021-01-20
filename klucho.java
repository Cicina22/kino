package fest.projekt;

import java.util.Scanner;

public class FestProjekt {

    

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("1 = miesto je už obsadené");
	    System.out.println("0 = miesto je voľné");
	    System.out.println("Zvyslo sú rady od 1-8 a vodorovne stĺpce od 1-5");

	    int[][]kino = {
	       {1,0,1,0,1},
	       {0,1,0,1,0},
	       {1,1,0,1,0},
	       {1,0,1,0,1},
	       {1,0,1,0,1},
	       {0,1,0,1,0},
	       {1,1,0,1,0},
	       {1,0,1,0,1}
	   };


	    System.out.print("    | ");
	    for(int j = 0; j < kino[0].length; j++)
	    {
	    	System.out.print(j + 1);
	    	System.out.print(" | ");
	    }
	    System.out.println();
	    
	for (int i = 0; i < kino.length; i++)
	{
		int p = i + 1;
		System.out.print("|" + p + "|");
	    for (int j = 0; j < kino[0].length; j++)
	    {
	        System.out.print(" | " + kino[i][j]);
	    }
	    System.out.println(" |");
	}
	
	for(boolean repeat = true;repeat == true;)
	{
	int rad = 0;
	boolean again = true;
	while(again == true)
	{
		
		System.out.println("Vyber si radu:");
		rad = scanner.nextInt() -1;
		
		if ( rad > 7 || rad < 0)  
			System.out.println("táto rada neexistuje");
		else
			again = false;
		
	}


	
	int sedacka = 0;
	while(again == false)
	{
	System.out.println("Vyber si sedadlo:");
	sedacka = scanner.nextInt() -1;
	if (sedacka > 4 || sedacka <0) 
	System.out.println("Toto sedadlo neexistuje");
	else
		again = true;
	}
	




	if (kino[rad][sedacka] == 0){
	System.out.println("Sedadlo je voľné");
	kino[rad][sedacka] = 1;
	Scanner rez = new Scanner(System.in);
	System.out.println("Chcete sedadlo rezervovať ? (1/0)");
	int rezer = rez.nextInt();
	repeat = false;

        if (rezer == 1) {
       
          System.out.println("Sedadlo je rezervované");  
        	    
          System.out.print("    | ");
	  kino[rad][sedacka] = 8 ; 
          for(int j = 0; j < kino[0].length; j++)
	    {
	    	System.out.print(j + 1);
	    	System.out.print(" | ");
	    }
	    System.out.println();
	    
	for (int i = 0; i < kino.length; i++)
	{
		int p = i + 1;
		System.out.print("|" + p + "|");
	    for (int j = 0; j < kino[0].length; j++)
	    {
	        System.out.print(" | " + kino[i][j]);
	    }
	    System.out.println(" |");
	}
       System.out.println("Číslo 8 je vaše rezervované sedadlo");
        }
        

	}

	else if (kino[rad][sedacka] == 1){
	System.out.println("Sedadlo je obsadené, vyberte si iné sedadlo");
	repeat = true;

	}

	}

	}
}


