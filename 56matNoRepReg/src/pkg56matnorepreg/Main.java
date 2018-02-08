
package pkg56matnorepreg;

import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,num,lim,total,rep=0,cont=0,k=0,cicles;
        Random rnd = new Random();
        int[]v=new int[9];
        Scanner scan=new Scanner(System.in);
        System.out.println("digues quantes matrius vols que tingui el cuadrat");
        cicles=scan.nextInt();
        total=cicles*3;
        int [][] matriu= new int [total][total];
        int [][] mat= new int [3][3];
        // posem zeros a la matriu gran
        for (i=0;i<total;i++){
            System.out.println();
            for(j=0;j<total;j++){
                matriu[i][j]=0;
               System.out.print(matriu[i][j]+" ");
            }
        }
        for (lim=0;lim<cicles;lim++){
            cont++;
        //fem vector no repetits
        for (i=0;i<9;i++){
            v[i]= rnd.nextInt(9)+1;
            for(j=0;j<i;j++){
                if (v[i]==v[j]){
                i--;
                rep++;
                j=i+1;
              }
            }
           
        }
         System.out.println("\n");
        //imprimim vector
        for(i=0;i<9;i++){
             System.out.print(v[i]);
        }
        System.out.println("\n");
        //posem vector a la matriu
        cont=0;
        for (i=0;i<3;i++){
             System.out.println();
            for(j=0;j<3;j++){
              mat[i][j]=v[cont];
              cont++;
               System.out.print(mat[i][j]+" ");
            }
        }
         System.out.println("\n");
        // posem matriu petita a la matriu gran
         for (i=0;i<3;i++){
            System.out.println();
            for(j=0;j<3;j++){
                matriu[i+k][j+k]=mat[i][j];
               System.out.print(matriu[i+k][j+k]+" ");
            }
        }
         System.out.println(k+"eeeeee ");
         k+=3;
        }
         for (i=0;i<total;i++){
            System.out.println();
            if (i%3==0){
              System.out.println();   
            }
            for(j=0;j<total;j++){
                if(j%3==0){
                 System.out.print(" ");   
                }
               if (matriu[i][j]==0){
                 System.out.print("- ");   
               }else 
               System.out.print(matriu[i][j]+" ");
            }
        }

        
       
    }
    
}
