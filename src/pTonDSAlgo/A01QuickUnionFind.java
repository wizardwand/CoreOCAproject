package pTonDSAlgo;

/**
 * Created by patimshi on 1/20/2017.
 */
public class A01QuickUnionFind {
    int[] nodeArr ;
    A01QuickUnionFind(int size ){
        nodeArr = new int[size];
        for(int i = 0 ; i < size ; i ++)
            nodeArr[i] = i ;
    }

    void union (int p , int q ){

    }

    boolean connected (int p , int q ){
        return false;
    }

    int find (int p){
        return 0;
    }

    int count(){
        return  0;
    }
}
