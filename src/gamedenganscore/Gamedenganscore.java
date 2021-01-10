
package gamedenganscore;

import java.util.Scanner;
public class Gamedenganscore {


    public static void main(String[] args) {
        
        int a = (int) (Math.random() * 100);// acak angka dari 0-100
        int c = 100; // variabel yang menyimpan jumlah skor
        int i; //variabel yang menyimpan jumlah banyaknya pengulangan program

        System.out.println("Hai.. nama saya Mr. Jerry,\n" +"Saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100.\n" +"Silakan tebak ya!!!\n" +"----------------------------------------------------------------------");
        
        
        for (i=0; i<=49 ; i++ ){
            System.out.println("Tebakan Anda : " );
            Scanner jawab = new Scanner(System.in);
            int b = jawab.nextInt();

                if (b == a) {

                    System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                    if (i<=4){
                        System.out.println("Total Skor : " + c);
                        c += 50;
                        System.out.println("(dan anda mendapatkan bonus skor sebesar 50)");
                    }
                    System.out.println("Skor Akhir :" + c);
                    break;
                } else if (b < a) {
                    c -= 2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil\n" +"Silahkan mencoba kembali!!!");
                    System.out.println("Skor sementara :" + c);
                    System.out.println("----------------------------------------------------------------------");
                } else if (b > a) {
                    c -= 2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Hehehe… Bilangan tebakan anda terlalu besar\n" +"Silahkan mencoba kembali!!!");
                    System.out.println("Skor sementara :" + c);
                    System.out.println("----------------------------------------------------------------------");
            }
            if (c == 0){
                System.out.println("Maaf kesempatan anda telah habis");
                System.out.println("Angka yang dimaksud adalah : " + a);
                break;
            }
            }

    }
}



            

         

               
        
            

   
