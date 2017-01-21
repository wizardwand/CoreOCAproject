package pTonDSAlgo;

import java.util.Scanner;

/**
 * Created by patimshi on 1/20/2017.
 */
public class UFClient {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A01QuickUnionFind uf = new A01QuickUnionFind(N);
        while (!sc.hasNext()){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(!uf.connected(p, q )){
                uf.union(p,q);
                System.out.println(p+ " " + q);
            }
        }
    }
}
