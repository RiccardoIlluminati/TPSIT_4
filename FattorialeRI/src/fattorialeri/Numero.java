

package fattorialeri;


public class Numero extends Thread{
    private int n;
    public Numero (int x){
         this.n = x;
    }
    public void run(){
        int prodotto =1, i=1;
        while(i<=this.n){
            prodotto = prodotto * i;
            i = i+1;
        }
        System.out.println("Il fattoriale " + this.n + " e'" + prodotto);
    }
}

