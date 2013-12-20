class Motor extends Kendaraan{

public void methodRoda(){
super.methodKendaraan();
System.out.println("Motor Jumlah Roda = 2");
}
public void methodAction(){
System.out.println("Motor dapat Jumping");
}
public static void main(String[] args){
Motor oks = new Motor();
oks.methodRoda();
oks.methodAction();
}
}