/**
 * @author Pratik Ghute
 * Solution for following problem
 * https://codeforces.com/problemset/problem/151/A
 * 
 * 
 * 
 * Number of Friends                            -n  3
 * Number Soft Drink Bottols                    -k  4
 * Each Bottle contains mililitres of drink     -l  5
 * Number of limes                              -c  10
 * Each lime cut into slices                    -d  8
 * Grams of salt                                -p  100
 * Each friend need drink of                    -nl 3
 * Each frind need grams of salt                -np 1
 * 
 * 
 * Total slices of Lime                         - c*d
 * Total Drink                                  - k*l
 * 
 * To make a toast     Drink (nl)  +  a slice of lime (1) +  gram of salt(np)  
 * 
 * 
 * smallest of  (k*l)/(n*nl)      (c*d)/n       (p/(n*np))
 */
import java.util.Scanner;
public class Solution21{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int con1 = (k*l)/(n*nl);
        int con2 = (c*d)/n;
        int con3 = (p/(n*np));
        System.out.println(
            con1<con2?(con1<con3?con1:con3):(con2<con3?con2:con3)
        );
        sc.close();
    }
}