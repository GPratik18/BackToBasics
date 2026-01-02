/**
*Pratik Ghute: 31-12-2025
*Solution for 
*https://codeforces.com/problemset/problem/799/B
*/


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution23{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int noOfTShirts = sc.nextInt();

		int[] price = new int[noOfTShirts];
		byte[] frontColor = new byte[noOfTShirts];

		for(int i=0;i<noOfTShirts;i++){
			price[i] = sc.nextInt();
		}
		
		
		for(int i=0;i<noOfTShirts;i++){
			frontColor[i] = sc.nextByte();
		}
		PriorityQueue<TShirt> llfor1 = new PriorityQueue<>(Comparator.comparingInt(ts -> ts.price));
		PriorityQueue<TShirt> llfor2 = new PriorityQueue<>(Comparator.comparingInt(ts -> ts.price));
		PriorityQueue<TShirt> llfor3 = new PriorityQueue<>(Comparator.comparingInt(ts -> ts.price));
		for(int i=0;i<noOfTShirts;i++){
			byte backColor = sc.nextByte();
			TShirt t = new TShirt(price[i]);
			if(frontColor[i] == 1 || backColor == 1) llfor1.add(t);
			if(frontColor[i] == 2 || backColor == 2) llfor2.add(t);
			if(frontColor[i] == 3 || backColor == 3) llfor3.add(t);
		}
		// System.out.println(llfor1);
		// System.out.println(llfor2);
		// System.out.println(llfor3);

		int customer = sc.nextInt();
		for(int i=0;i<customer;i++){
			int color = sc.nextByte();
			switch(color){
				
				case 1 ->{
					while(!llfor1.isEmpty() && llfor1.peek().sold){
						llfor1.poll();
					}
					if(llfor1.isEmpty()){
						System.out.print("-1 ");
						break;
					}else{
						TShirt chosen = llfor1.poll();
						chosen.sold = true;
						System.out.print(chosen.price+" ");
					}
					
				}

				case 2 ->{
					while(!llfor2.isEmpty() && llfor2.peek().sold){
						llfor2.poll();
					}
					if(llfor2.isEmpty()){
						System.out.print("-1 ");
						break;
					}else{
						TShirt chosen = llfor2.poll();
						chosen.sold = true;
						System.out.print(chosen.price+" ");
					}
					
				}

				case 3 ->{
					while(!llfor3.isEmpty() && llfor3.peek().sold){
						llfor3.poll();
					}
					if(llfor3.isEmpty()){
						System.out.print("-1 ");
						break;
					}else{
						TShirt chosen = llfor3.poll();
						chosen.sold = true;
						System.out.print(chosen.price+" ");
					}
					
				}
			}
		}

	}
		
}


class TShirt{
	int price;
	boolean sold;

	public TShirt(int price){
		this.price = price;
		this.sold = false;
	}

	@Override
	public String toString(){
		return "[ TSHIRT :  "+ this.price +"   ]";
	}
	
}

