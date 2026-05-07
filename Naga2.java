public class Naga2 extends Musuh2 {
    
    public Naga2() {
        super("Naga Api Pink", 500);
    }
    
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "menyemburkan nafas api dari udara! Player -50 HP");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + "Naga: ROAAARRR!");
    }

}
