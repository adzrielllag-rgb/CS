import java.util.Scanner;
public class CASEMATOD1 { 
    public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      System.out.println("====INPUT DATA MAHASISWA====");
      System.out.print("Nama : ");
      String nama = sc.nextLine();
      System.out.print("NIM  : ");
      String nim = sc.nextLine();
      
      System.out.println();
      System.out.println("--- Mata Kuliah 1: Algoritma dan Pemprogaman ---");
      System.out.print("Nilai Tugas : ");
      double tugas = sc.nextDouble();
      System.out.print("Nilai UTS   : ");
      double uts = sc.nextDouble();
      System.out.print("Nilai UAS   : ");
      double uas = sc.nextDouble();

      System.out.println();
      System.out.println("--- Mata Kuliah 2: Struktur Data ---");
      System.out.print("Nilai Tugas : ");
      double tugas2 = sc.nextDouble();
      System.out.print("Nilai UTS   : ");
      double uts2 = sc.nextDouble();
      System.out.print("Nilai UAS   : ");
      double uas2 = sc.nextDouble();

      sc.close();    
      }
    }


