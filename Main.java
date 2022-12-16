//Pervin Yaren Ünsal 02190201016

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Diziyi girin: ");
        String metin = scanner.nextLine();
        String [] sayilar1 = metin.split(",");
        int uzunluk = sayilar1.length;
        int [] sayilar = new int[uzunluk];
        boolean kontrol = false;

        for(i=0; i<sayilar1.length;i++)
            sayilar[i] = Integer.parseInt(sayilar1[i]);

        if(sayilar[0] > sayilar[1] || sayilar[0] > sayilar[2])
            kontrol = true;

        for(i=1;i<uzunluk;i++)
            try {
                if (sayilar[i] < sayilar[(i - 1) / 2] || sayilar[i] > sayilar[(2 * i) + 1] || sayilar[i] > sayilar[(2 * i) + 2])
                    kontrol = true;
            } catch (Exception ignored) {
            }

        if(kontrol){
            System.out.println("Min heap değildir.");

            for(i=0;i<uzunluk;i++){
                for(int j = 0; j < uzunluk; j++){
                    if(sayilar[0] > sayilar[1]){
                        int temp;
                        temp = sayilar[1];
                        sayilar[1] = sayilar[0];
                        sayilar[0] = temp;
                    }
                    if(sayilar[0] > sayilar[2]){
                        int temp;
                        temp = sayilar[2];
                        sayilar[2] = sayilar[0];
                        sayilar[0] = temp;
                    }
                    try {
                        int temp;

                        try {
                            if (sayilar[i] < sayilar[(i - 1) / 2]) {
                                temp = sayilar[i];
                                sayilar[i] = sayilar[(i - 1) / 2];
                                sayilar[(i - 1) / 2] = temp;
                            }
                        }catch (Exception ignored){}

                        try {
                            if (sayilar[i] > sayilar[(2 * i) + 1]) {
                                temp = sayilar[i];
                                sayilar[i] = sayilar[(2 * i) + 1];
                                sayilar[(2 * i) + 1] = temp;
                            }
                        }catch (Exception ignored){}

                        try {
                            if (sayilar[i] > sayilar[(2 * i) + 2]) {
                                temp = sayilar[i];
                                sayilar[i] = sayilar[(2 * i) + 2];
                                sayilar[(2 * i) + 2] = temp;
                            }
                        }catch (Exception ignored){}
                    }catch (Exception ignored){

                    }
                }
            }

            for(i=0;i<uzunluk;i++)
                System.out.print(sayilar[i]+", ");

            System.out.print("\b\b");

        }else
            System.out.println("Min heaptir");



    }
}