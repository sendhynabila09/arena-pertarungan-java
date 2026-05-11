public abstract class Musuh2 {
      protected String namaMusuh;
      protected int healthPoint;
      
      public Musuh2 (String nama, int hp) {
        this.namaMusuh = nama;
        this.healthPoint = hp;
      }

      public void terimaDamage(int damage) {
        this.healthPoint -= damage;
        if (this.healthPoint < 0) {
            this.healthPoint = 0;
        }
        System.out.println(this.namaMusuh + "terkena serangan! Sisa HP: " + this.healthPoint);
      }

      public abstract void serangPemain();

      public abstract void suaraKhas();
} 
