import java.util.Scanner;
public class CASEMATOD1 { 
    public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      System.out.println("====INPUT DATA MAHASISWA====");
      System.out.print("Nama : ");
      String nama = sc.nextLine();
      System.out.print("NIM  : ");
      long nim = sc.nextLong();
      
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
      
      double nilai = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
      double nilai2 = (tugas2 * 0.3) + (uts2 * 0.3) + (uas2 * 0.4);
      
      String huruf1 = "";
      if (nilai > 80 && nilai <= 100) {
        huruf1 = "A";
      } else if (nilai > 73 && nilai <= 80) {
        huruf1 = "B+";
      } else if (nilai > 65 && nilai <= 73) {
        huruf1 = "B";
      } else if (nilai > 60 && nilai <= 65) {
        huruf1 = "C+";
      } else if (nilai > 50 && nilai <= 60) {
        huruf1 = "C";
      } else if( nilai > 39 && nilai <= 50) {
        huruf1 = "D";
      } else  {
        huruf1 = "E";
      }

      String huruf2 = "";
      if (nilai2 > 80 && nilai2 <= 100) {
        huruf2 = "A";
      } else if (nilai2 > 73 && nilai2 <= 80) {
        huruf2 = "B+";
      } else if (nilai2 > 65 && nilai2 <= 73) {
        huruf2 = "B";
      } else if (nilai2 > 60 && nilai2 <= 65) {
        huruf2 = "C+";
      } else if (nilai2 > 50 && nilai2 <= 60) {
        huruf2 = "C";
      } else if (nilai2 >39 && nilai2 <= 50) {
        huruf2 = "D";
      } else {
        huruf2 = "E";
      }
      String status1 = "";
      if (nilai >60) {
        status1 = "Lulus";
      } else {
        status1 = "Tidak Lulus";
      }      

      String status2 = "";
      if (nilai2 >60) {
        status2 = "Lulus";
      } else {
        status2 = "Tidak Lulus";
      }
      
      System.out.println();
      System.out.println("======= HASIL PENELITIAN AKADEMIK =======");
      System.out.print("Nama : " + nama);
      System.out.println("");
      System.out.print("NIM  : " + nim);
      System.out.println("\n");
      System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTUGAS\tNILAI AKHIR\tNILAI HURUF\tSTATUS");
      System.out.println("----------------------------------------------------------------------------------------");
      System.out.print("Algoritma dan Pemprogaman\t" + uts + "\t" + uas + "\t" + tugas + "\t" + nilai + "\t\t" + huruf1 + "\t\t" + status1);
      System.out.println();
      System.out.print("Struktur Data\t\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + nilai2 + "\t\t" + huruf2 + "\t\t" + status2);
      System.out.println("\n");

      double rataRata = (nilai + nilai2) / 2;
      String kelulusan = "";
      if (rataRata >= 70) {
        kelulusan = "Lulus";
      } else {
        kelulusan = "Tidak Lulus";
      }
      System.out.println("Ratarata Nilai Akhir : " + rataRata);
      System.out.print("Status Smester       : " + kelulusan);

      sc.close();    
      }
    }


