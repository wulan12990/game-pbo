public class Zombie extends Musuh {

    public Zombie() {
    super("Zombie Cimol", 50);
    }

@Override
public void serangPemain() {
    System.out.println(this.namaMusuh + " merangkak dan mengamuk! -15 HP");
} 

@Override
public void suaraKhas() {
    System.out.println(this.namaMusuh + ": Ughhh... brainss...");
} 
}
