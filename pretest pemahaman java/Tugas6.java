import java.util.Scanner;

public class Tugas6{

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = scanner.nextInt();
        String hasil = Hitung(nilai);
        System.out.println("nilai yang anda masukan adalah " + nilai + " dan dinyatakan " + hasil);
    }
     
    public static String Hitung(int x) {
        int nilai = x;
        
        String hasil;
        if (nilai < 60 ){
            hasil = "tidak lulus";
        } else {
            hasil = "lulus ";
        }
        
        return hasil; 
    }
}