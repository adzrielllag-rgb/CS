import java.util.Scanner;
public class CASEMATOD1 { 
    public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      System.out.println("====INPUT DATA MAHASISWA====");
      System.out.print("Nama : ");
      String nama = sc.nextLine();
      System.out.print("NIM  : ");
      long nim = sc.nextLong();
      
      System.out.println("\n");
      System.out.println("--- Mata Kuliah 1: Algoritma dan Pemprogaman ---");
      System.out.print("Nilai Tugas : ");
      double tugas = sc.nextDouble();
      System.out.print("Nilai UTS   : ");
      double uts = sc.nextDouble();
      System.out.print("Nilai UAS   : ");
      double uas = sc.nextDouble();

      System.out.println("\n");
      System.out.println("--- Mata Kuliah 2: Struktur Data ---");
      System.out.print("Nilai Tugas : ");
      double tugas2 = sc.nextDouble();
      System.out.print("Nilai UTS   : ");
      double uts2 = sc.nextDouble();
      System.out.print("Nilai UAS   : ");
      double uas2 = sc.nextDouble();
      
      double nilai = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
      double nilai2 = (tugas2 * 0.3) + (uts2 * 0.3) + (uas2 * 0.4);
      
      if (nilai2/nilai >= 80 && nilai2/nilai <= 100) {
        System.out.println("A") ;
      } else if (nilai2/nilai >= 68 && nilai2/nilai < 80) {
        System.out.println("B");
      } else if (nilai2/nilai >= 56 && nilai2/nilai < 68) {
        System.out.println("C");
      } else if (nilai2/nilai >= 45 && nilai2/nilai < 56) {
        System.out.println("D");
      } else if (nilai2/nilai >= 0 && nilai2/nilai < 45) {
        System.out.println("E");
      } else {
        System.out.println("gagal");
      }

      if (nilai2/nilai >60) {
        System.out.println("Lulus");
      } else {
        System.out.println("Tidak Lulus");
      }      

      


      sc.close();    
      }
    }


