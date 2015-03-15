/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

public class JavaApplication1 {
    public static void shell(int[] a) {
        int comps = 0, swaps = 0;

	int increment = a.length / 2;
	while (increment > 0) {
		for (int i = increment; i < a.length; i++) {
			int j = i;
			int temp = a[i];
                        comps++;
			while (j >= increment && a[j - increment] > temp) {
                                comps++;
                                
                                swaps++;
				a[j] = a[j - increment];
				j = j - increment;
			}
			a[j] = temp;
		}
           
		if (increment == 2) {
			increment = 1;
		} else {
			increment *= (5.0 / 11);
		}
	}
}
    
       public static void insertionSort(int[] list) {
    int comps = 0, swaps = 0;
    
    for(int i = 1; i < list.length; i++) {
    
      int j = i;      
            
      // compare i with sorted elements and insert it
      // sorted elements: [0..i-1]
      while (j > 0 && list[j] < list[j - 1]) {
        
        int temp = list[j];
        list[j] = list[j - 1];
        list[j - 1] = temp;
        
        swaps++;
        comps++;  // loop condition true
         
        j--;
      }
      comps++; // checking loop condition when false
    }
    
    
    System.out.println("Insertion Sort için gerçekleştirilen swap sayisi: "+ swaps);
    System.out.println("Insertion Sort için gerçekleştirilen comperation sayısı: "+ comps);
  }

	
	public static void SelectionSort ( int [] num )
	{
	     int i, j, first, temp,swap=0,compresion=0;  
	     for ( i = num.length - 1; i > 0; i -- )  
	     {
	          first = 0; 
	          for(j = 1; j <= i; j ++)   
	          {
	        	   compresion++;
	               if( num[ j ] < num[ first ] )         
	                 first = j;
	          }
	          swap++;
	          temp = num[ first ];   
	          num[ first ] = num[ i ];
	          num[ i ] = temp; 
	      }
	     System.out.println("\n Selection Sort icin gerceklestirilen swap sayisi : "+swap
	    		 +"\n Selection Sort icin gerceklestirilen compression sayisi : "+compresion+"\n");
	}
	
	public static void BubbleSort(int [] dizi)
	{
	    int temp,compression=0,swap=0;
	    for (int i=1; i<dizi.length; i++)
	    {
	        for(int j=0; j<dizi.length-i; j++)
	        {
	        	compression++;
	            if (dizi[j] < dizi [j+1])
	            {
	            	swap++;
	                temp = dizi [j];
	                dizi [j] = dizi [j+1];
	                dizi [j+1] = temp;
	            }
	        }
	    }
	    System.out.println("\n Bubble Sort icin gerceklestirilen swap sayisi : "+swap
	    		 +"\n Bubble Sort icin gerceklestirilen compression sayisi : "+compression+"\n");
	}
	
	public static void show(int[] arr){
		System.out.println("dizinin son hali: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void enterOfArray(int[] arr)
	{
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000);
		}
	}
	
	
	public static void main(String[] args) {
	System.out.println("********* 10 elemanlı dizi için: ");
		  // Random nesnesi olusturduk
        Random r = new Random();
        //10 elemanli iki dizi olusturduk
        int[] dizi=new int[10];
        double [] dizi1=new double[10];
         
        //olusturdugumuz ilk diziye random sayilar atayalim.
        for (int i = 0; i < 10; i++) {
            //0 ile 99 arasinda rasgele sayi uretip diziye ekliyoruz
            dizi[i]=r.nextInt(100);
             
        }
        insertionSort(dizi);
        SelectionSort(dizi);
        BubbleSort(dizi);
        shell(dizi);
        
        
        System.out.println("********* 50 elemanlı dizi için: ");

          // Random nesnesi olusturduk
        Random rx = new Random();
        //10 elemanli iki dizi olusturduk
        int[] dizix=new int[50];
        double [] dizi1x=new double[50];
         
        //olusturdugumuz ilk diziye random sayilar atayalim.
        for (int i = 0; i < 50; i++) {
            //0 ile 99 arasinda rasgele sayi uretip diziye ekliyoruz
            dizix[i]=r.nextInt(100);
             
        }
        insertionSort(dizix);
        SelectionSort(dizix);
        BubbleSort(dizix);
        shell(dizix);
        
        System.out.println("********* 100 elemanlı dizi için: ");

          // Random nesnesi olusturduk
        Random ry = new Random();
        //10 elemanli iki dizi olusturduk
        int[] diziy=new int[100];
        double [] dizi1y=new double[100];
         
        //olusturdugumuz ilk diziye random sayilar atayalim.
        for (int i = 0; i < 100; i++) {
            //0 ile 99 arasinda rasgele sayi uretip diziye ekliyoruz
            diziy[i]=r.nextInt(200);
             
        }
        insertionSort(diziy);
        SelectionSort(diziy);
        BubbleSort(diziy);
        shell(diziy);
        
        
        System.out.println("********* 200 elemanlı dizi için: ");

          // Random nesnesi olusturduk
        Random rz = new Random();
        //10 elemanli iki dizi olusturduk
        int[] diziz=new int[200];
        double [] dizi1z=new double[200];
         
        //olusturdugumuz ilk diziye random sayilar atayalim.
        for (int i = 0; i < 200; i++) {
            //0 ile 99 arasinda rasgele sayi uretip diziye ekliyoruz
            diziz[i]=r.nextInt(300);
             
        }
        insertionSort(diziz);
        SelectionSort(diziz);
        BubbleSort(diziz);
        shell(diziz);
        
        System.out.println("********* 500 elemanlı dizi için: ");

          // Random nesnesi olusturduk
        Random rt = new Random();
        //10 elemanli iki dizi olusturduk
        int[] dizit=new int[500];
        double [] dizi1t=new double[500];
         
        //olusturdugumuz ilk diziye random sayilar atayalim.
        for (int i = 0; i < 500; i++) {
            //0 ile 99 arasinda rasgele sayi uretip diziye ekliyoruz
            dizit[i]=r.nextInt(600);
             
        }
        insertionSort(dizit);
        SelectionSort(dizit);
        BubbleSort(dizit);
        shell(dizit);
	}
}