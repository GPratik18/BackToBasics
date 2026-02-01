/**
*Pratik Ghute: 06-01-2026
*Solution for (Pending to solve)
*https://codeforces.com/problemset/problem/2069/B
*/

// import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution35{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int i=0;i<noOfTestCases;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            ArrayList<Pair> strangerSet1 = new ArrayList<>();
            ArrayList<Pair> strangerSet2 = new ArrayList<>();

            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    if(j%2==0){
                        if(k%2==0){
                            strangerSet1.add(new Pair(j, k, sc.nextInt()));
                        }else{
                            strangerSet2.add(new Pair(j, k, sc.nextInt()));
                        }
                    }else{
                        if(k%2==0){
                            strangerSet2.add(new Pair(j, k, sc.nextInt()));
                        }else{
                            strangerSet1.add(new Pair(j, k, sc.nextInt()));
                        }
                    }
                }
            }

            


        }
        


        
    } 
} 
class Pair{
    int i;
    int j;
    int color;

    public Pair(int i, int j, int color){
        this.i =i;
        this.j = j;
        this.color = color;
    }

    @Override
    public String toString(){
        return "[ i: "+i+ ", j: "+j+ ", color "+color+" ]";
    }

    static boolean areStrangers(Pair p, Pair q){
        if(p.i+1<q.i || p.i-1>q.i || p.j+1<q.j || p.j-1>q.j){
            return true;
        }
        if(p.i+1 ==  q.i && p.j+1 == q.j){
            return true;
        }
        if(p.i-1 ==  q.i && p.j-1 == q.j){
            return true;
        }
        if(p.i+1 ==  q.i && p.j-1 == q.j){
            return true;
        }
        if(p.i-1 ==  q.i && p.j+1 == q.j){
            return true;
        }

        if(p.i-1 == q.i || p.j-1 == q.j || p.i+1 == q.i || p.j+1 == q.j){
            return false;
        }

        return true;
    }
}


