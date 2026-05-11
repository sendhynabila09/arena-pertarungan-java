public class Slime2 extends Musuh2 implements BisaLoot {
    
    public Slime2() {
        super("Slime Asam", 50);
    }

    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + "Slime menjatuhkan item: Gel Asam!.");
    }
    
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat dan menyiram cairan asam! Player -15 HP");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + "Slime: Blup blup!");
    }

}
