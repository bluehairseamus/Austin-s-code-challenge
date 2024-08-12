//code made/modified by Seamus.C on 8/11/2024
//I used/modified code from https://www.geeksforgeeks.org/multithreading-in-java/ as before this project I didnt know how to multi thread in java

import java.util.Random;
class MultithreadingDemo implements Runnable {
    public void run()
	{
        Random rand = new Random();
        long rep = 62500000L;
        int max = 0;
        for(long x=0;x<rep;x++){
            int z = 0;
            for(int y=0;y<232;y++){if(rand.nextInt(4) == 0){z++;}}
            if(x>max){max=z;}}
        System.out.print(max+"  ");
    }
}
class Main {
    public static void main(String[] args)
	{
		int n = 16; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
				= new Thread(new MultithreadingDemo());
			object.start();
		}
}}
