//Pada menu 2, jika kursi kosong, ganti null dengan ***
//Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang
//dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan
//baris dan kolom kembali
import java.util.Scanner;

public class Modif4BioskopWithScanner28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton berhasil ditambahkan.");
                        } else {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia. Silakan pilih kembali.");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Program berakhir.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
                    break;
            }

            System.out.print("Kembali ke menu utama? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();

    }
}