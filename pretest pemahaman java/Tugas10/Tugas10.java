public class Tugas10{
    
	public static void main(String[] args){
	    BTugas10 x = new BTugas10();

		x.setNama("Guntur Desi Hidayani");
		x.setUmur(21);
		x.setAlamat("Senenan Jepara");

		String CetakNama = x.getNama();
		int CetakUmur = x.getUmur();
		String CetakAlamat = x.getAlamat();

		System.out.println("Nama : " + CetakNama + "\nAlamat : " + CetakUmur + "\nUmur : " + CetakAlamat);
	}
}