public class Naga2 extends Musuh2 implements BisaTerbang, BisaLoot {
    
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

    @Override
    public void lepasLandas() {
        System.out.println(this.namaMusuh + "terbang tinggi! Sulit diserang." );
    }

    @Override
    public void seranganUdara() {
        System.out.println(this.namaMusuh + "menyemburkan badai api! Pemain -80 HP.");
    }

    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + "Naga menjatuhkan item: Sisik Naga api!.");
    }
}
