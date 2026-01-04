/**
*Pratik Ghute: 31-12-2025
*Solution for 
*https://codeforces.com/problemset/problem/785/A
*/

import java.util.Scanner;

public class Solution26{
	public static void main(String[] args) throws  Exception{
    
		Scanner sc = new Scanner(System.in);
		int noOftestCases = sc.nextInt(); sc.nextLine();
        long sum = 0;
		for(int i=0;i<noOftestCases;i++){
           sum += getFaces(sc.nextLine());
		}
        System.out.println(sum);
    }
    public static int getFaces(String str){
        switch (str) {
            case "Tetrahedron"-> {return 4;}
            case "Cube"-> {return 6;}
            case "Octahedron"-> {return 8;}
            case "Dodecahedron"-> {return 12;}
            case "Icosahedron"-> {return 20;}
            default ->{return 0;}
        }
    }
}



