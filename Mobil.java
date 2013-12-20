class Mobil extends Kendaraan{

public void methodRoda(){
super.methodKendaraan();
System.out.println("Mobil Jumlah Roda = 4");
}
public void methodAction(){
System.out.println("Mobil Bergerak mundur");
}
public static void main(String[] args){
Mobil oks = new Mobil();
oks.methodRoda();
oks.methodAction();
}
}