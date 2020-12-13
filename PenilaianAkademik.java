/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenilaianAkademik;

/**
 *
 * @author gokpraz
 */

import java.util.*;

public class PenilaianAkademik {
   // Implementasi variabel yang digunakan
   
   /**
    * Variabel array untuk menampung data mahasiswa
    */
   public static String[] mahasiswa = {
      "Agus Prasetyo", "Muhammad Goku", "Ahmad Naruto Uzumaki", "Putri Tsunade", "Tsubasa Widodo", "Uchiha Melkan" 
   };
   
   /**
    * Variabel array untuk menampung data mata kuliah
    */
   public static String[] mata_kuliah = {
      "Dasar Pemrograman", "Pemrograman Web", "Pemrograman Mobile", "Struktur Data", "Matematika Diskrit"
   };
   
   /**
    * Variabel yang digunakan untuk menampung nilai dari mahasiswa berdasarkan mata kuliah
    * Format nilai berdasarkan lokasi array :
    * Baris = Index Mahasiswa
    * Kolom = Index Mata Kuliah
    * Ex : nilai_mahasiswa[5][3] = dia mengambil nilai dari mahasiswa index/baris ke [5] dan mata kuliah kolom ke [3] 
    */
   public static int[][] nilai_mahasiswa = {
      {100, 30, 30, 10, 50},
      {80, 40, 70, 30, 50},
      {70, 50, 70, 90, 60},
      {60, 80, 70, 60, 55},
      {70, 60, 40, 50, 70},
      {70, 30, 80, 60, 50},
   };
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int pilih_menu;
      int index_pilih_mahasiswa, index_pilih_mata_kuliah, input_kelola_nilai;
      
      do {         
         
         menu();
         System.out.print("Pilih menu yang dipilih (berdasarkan angka) : ");
         pilih_menu = sc.nextInt();

         switch(pilih_menu){
            case 1 : 
               // Menampilkan daftar mahasiswa
               daftarMahasiswa();
               break;

            case 2 : 
               // Menampilkan daftar mata kuliah
               daftarMataKuliah();
               break;

            case 3 :
               // Menampilkan daftar mahasiswa
               daftarMahasiswa();
               
               System.out.println();
               System.out.print("Pilih mahasiswa yang akan dikelola (berdasarkan nomer) : ");
               index_pilih_mahasiswa = sc.nextInt();
               
               // memanggil fungsi yang memproses mahasiswa yang dipilih
               ambilMahasiswa(index_pilih_mahasiswa);
               
               System.out.println();
               System.out.print("Pilih mata kuliah yang akan dikelola (berdasarkan nomer) : ");
               index_pilih_mata_kuliah = sc.nextInt();
               
               // Memanggil fungsi yang digunakan untuk menampilkan nilai dan mata kuliah mahasiswa yang akan diubah
               daftarKelolaMataKuliah(index_pilih_mahasiswa, index_pilih_mata_kuliah);
               
               System.out.print("Masukan nilai yang akan diubah : " );
               input_kelola_nilai = sc.nextInt();
               
               // Memanggil fungsi yang digunakan untuk memproses nilai mata kuliah yang akan dirubah
               kelolaMataKuliah(input_kelola_nilai, index_pilih_mahasiswa, index_pilih_mata_kuliah);
               break;

            case 4 : 
               // Menampilkan daftar mahasiswa
               daftarMahasiswa();
               
               System.out.println();
               System.out.print("Pilih mahasiswa yang akan cetak KHS (berdasarkan nomer) : ");
               index_pilih_mahasiswa = sc.nextInt();
               
               // Memanggil fungsi yang digunakan untuk mencetak KHS berdasarkan mahasiswa yang dipilih
               cetakKHS(index_pilih_mahasiswa);
               break;

            case 5 :
               // Menampilkan daftar mata kuliah
               daftarMataKuliah();
               
               System.out.println();
               System.out.print("Pilih mata kuliah yang akan ditampilkan daftar nilai (berdasarkan nomer) : ");
               index_pilih_mata_kuliah = sc.nextInt();
               
               // Memanggil fungsi yang digunakan untuk menampilkan mahasiswa dan nilai pada matakuliah tertentu
               daftarNilaiPerMataKuliah(index_pilih_mata_kuliah);
               break;
               
            case 6 :
               System.out.println("Terima Kasih");
               break;
         }
         
         // Digunakan agar ada jarak setelah memilih menu
         System.out.println("\n");
         
      } while (pilih_menu != 6);
      
   }
   
   
   /**
    * Digunakan untuk menampilkan menu
    */
   public static void menu()
   {
        System.out.println("==========================================");
        System.out.println("==|    =       PROJECT AKHIR      =    |==");
        System.out.println("            TULIS NAMA DISINI            ");
        System.out.println("==|    =    PENILAIAN AKADEMIK    =    |==");
        System.out.println("==========================================");
        
        System.out.println("Menu : ");
        System.out.println("1. Daftar Mahasiswa");
        System.out.println("2. Daftar Mata Kuliah");
        System.out.println("3. Input dan Kelola Nilai");
        System.out.println("4. Cetak KHS");
        System.out.println("5. Daftar Nilai Per Mata Kuliah");
        System.out.println("6. Selesai");
        System.out.println();
   }
   
   /**
    * Fungsi yang digunakan untuk menampilkan data mahasiswa
    */
   public static void daftarMahasiswa()
   {
      System.out.println();
      System.out.println("[ Daftar Mahasiswa ]");
      System.out.println();
      
      // Melakukan perulangan berdasarkan jumlah mahasiswa
      for (int i = 0; i < mahasiswa.length; i++) {
         System.out.println(i + 1 + ". " + mahasiswa[i]);
      }
   }
   
    /**
    * Fungsi yang digunakan untuk menampilkan data mahasiswa berdasarkan index yang dipilih
    * dan pada fungsi ini juga menampilkan mata kuliah beserta nilai
    * @param pilih_mahasiswa 
    */
   public static void ambilMahasiswa(int index_mahasiswa)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_mahasiswa = index_mahasiswa - 1;
      int ambil_index = 0;
      
      for (int i = 0; i < mahasiswa.length; i++) {
         if (i == ubah_index_mahasiswa ) {
            ambil_index = ubah_index_mahasiswa;
            break;
         }
      }
      
      // Menampilkan daftar mata kuliah
      mahasiswaAmbilMataKuliah(ambil_index);
   }
   
   /**
    * Fungsi yang digunakan untuk menampilkan nilai mata kuliah mahasiswa
    */
   public static void mahasiswaAmbilMataKuliah(int index_mahasiswa)
   {
      System.out.println();
      System.out.println("Daftar Nilai Mahasiswa :  [ " + mahasiswa[index_mahasiswa] + " ]");
      System.out.println();
      
      // Melakukan perulangan berdasarkan jumlah Mata Kuliah
      for (int i = 0; i < mata_kuliah.length; i++) {
         System.out.println(i + 1 + ". " + mata_kuliah[i] + "\t [" + nilai_mahasiswa[index_mahasiswa][i] + "]");
      }
   }
   
   /**
    * Fungsi yang digunakan untuk menampilkan daftar mata kuliah
    */
   public static void daftarMataKuliah()
   {
      System.out.println();
      System.out.println("[ Daftar Mata Kuliah ]");
      System.out.println();
      
      // Melakukan perulangan berdasarkan jumlah Mata Kuliah
      for (int i = 0; i < mata_kuliah.length; i++) {
         System.out.println(i + 1 + ". " + mata_kuliah[i]);
      }
   }
   
   /**
    * Fungsi yang berfungsi untuk mengelola mata kuliah mahasiswa yang dipilih
    * @param index_mahasiswa
    * @param index_mata_kuliah 
    */
   public static void daftarKelolaMataKuliah(int index_mahasiswa, int index_mata_kuliah)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_mahasiswa = index_mahasiswa - 1;
      int ubah_index_mata_kuliah = index_mata_kuliah - 1;
      
      System.out.println();
      System.out.println("Mata kuliah yang dipilih :  [ " + mata_kuliah[ubah_index_mata_kuliah] + " ]");
      System.out.println("Nilai awal : " + nilai_mahasiswa[ubah_index_mahasiswa][ubah_index_mata_kuliah]);
      System.out.println();
   }
   
   /**
    * Fungsi ini digunakan untuk mengelola nilai mata kuliah yang dirubah
    * @param input_kelola_nilai
    * @param index_mahasiswa
    * @param index_mata_kuliah 
    */
   public static void kelolaMataKuliah(int input_kelola_nilai, int index_mahasiswa, int index_mata_kuliah)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_mahasiswa = index_mahasiswa - 1;
      int ubah_index_mata_kuliah = index_mata_kuliah - 1;
      
      nilai_mahasiswa[ubah_index_mahasiswa][ubah_index_mata_kuliah] = input_kelola_nilai;
      
      System.out.println("Nilai dari mata kuliah [" + mata_kuliah[ubah_index_mata_kuliah] + "] dari mahasiswa [" + mahasiswa[ubah_index_mahasiswa] + "] berhasil dirubah");
   }
   
   /**
    * Fungsi ini digunakan untuk mencetak KHS sesuai dengan mahasiswa yang dipilih
    * @param index_mahasiswa 
    */
   public static void cetakKHS(int index_mahasiswa)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_mahasiswa = index_mahasiswa - 1;
      
      System.out.println("------------------------------------");
      System.out.println("          KARTU HASIL STUDI");
      System.out.println("------------------------------------");
      System.out.println("Nama : " + mahasiswa[ubah_index_mahasiswa]);
      System.out.println("------------------------------------");
      
      // perulangan untuk menampilkan nilai mahasiswa berdasarkan mata kuliah
      for (int i = 0; i < mata_kuliah.length; i++) {
         System.out.println(i + 1 + ". " + mata_kuliah[i] + "\t (" + nilai_mahasiswa[ubah_index_mahasiswa][i] + ")");
      }
      
      System.out.println("------------------------------------");
   }
   
   /**
    * Fungsi ini digunakan untuk menampilkan daftar nilai mahasiswa berdasarkan mata kuliah yang dipilih
    * @param index_mata_kuliah 
    */
   public static void daftarNilaiPerMataKuliah(int index_mata_kuliah)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_mata_kuliah = index_mata_kuliah - 1;
      
      System.out.println();
      System.out.println("Mata Kuliah : [ " + mata_kuliah[ubah_index_mata_kuliah] + " ]");
      System.out.println();
      
      // perulangan untuk daftar mahasiswa dan nilai pada mata kuliah tertentu
      for (int i = 0; i < mahasiswa.length; i++) {
         System.out.println(i + 1 + ". " + mahasiswa[i] + "\t (" + nilai_mahasiswa[i][ubah_index_mata_kuliah] + ")");
      }
   }
   
}
