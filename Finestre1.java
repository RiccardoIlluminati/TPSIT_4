/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finestre1;
import java.util.Scanner;
/**
 *
 * @author Studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        int i=0;
        
        int num;
        
        do{
            System.out.println("Inserire il numero di finestre");
            num = input.nextInt();
        }
        while(num<=0);
        
            Finestra f1;
            do{
               i=i+1;
               f1=new Finestra();
               f1.setVisible(true);
               f1.testo.setText("Sono la finestra"+1);
            }
            while(i<num);
        }
    }
