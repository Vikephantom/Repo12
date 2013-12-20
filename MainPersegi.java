public class MainPersegi{
	public static void main(String[] args){
		Persegi ps = new Persegi();
		ps.setPanjang(20);
		ps.setLebar(20);
		System.out.println("Panjang	:" + ps.getPanjang());
		System.out.println("Tinggi	:" + ps.getLebar());
		System.out.println("Luas	:" + ps.getLuas());
	}
}