class Kendaraan{
public void methodKendaraan(){
System.out.println("Roda,Kemudi(stang),dan Sadel");
}
public void methodAction(){
System.out.println("Jalankan,Rem");
}
public static void main(String[] args){
Kendaraan oks = new Kendaraan();
oks.methodKendaraan();
oks.methodAction();
}
}