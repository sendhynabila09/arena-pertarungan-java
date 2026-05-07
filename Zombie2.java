public class Zombie2 extends Musuh2 {
    
    public Zombie2() {
        super("Zombie ngesot", 150);
    }
    
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "menggigit dan memakan pemain! Player -20 HP");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + "Zombie: Uwaaaagh...");
    }
}