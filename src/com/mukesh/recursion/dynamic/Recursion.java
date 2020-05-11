package com.mukesh.recursion.dynamic;

public class Recursion {

    public int sumIteravtiveWay(int n)
    {
        int result=0;
        for (int i = 1; i <= n; i++) {
            result=result+i;
        }
        return result;
    }

    public int sumRecursionWay(int n){

        if (n==1)
        {
            return 1;
        }

        return n+sumRecursionWay(n-1);
    }
}
