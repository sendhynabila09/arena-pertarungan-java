import java.util.Scanner;

public class ArenaPertarungan2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Musuh2[] gelombangMonster = new Musuh2[4];

        gelombangMonster[0] = new Slime2();
        gelombangMonster[1] = new Naga2();
        gelombangMonster[2] = new Slime2();
        gelombangMonster[3] = new Zombie2();

        System.out.println("=====================================");
        System.out.println("ARENA RPG: GELOMBANG MONSTER");
        System.out.println("=====================================\n");

        System.out.println("AWAS! Sekelompok monster menghadang Anda!");

        boolean isBermain = true;

        while (isBermain) {

            System.out.println("\n--- STATUS MONSTER ---");

            for (int i = 0; i < gelombangMonster.length; i++) {
                System.out.println((i + 1) + ". "
                        + gelombangMonster[i].namaMusuh
                        + " (HP: "
                        + gelombangMonster[i].healthPoint + ")");
            }

            System.out.println("5. Kabur dari pertarungan");

            System.out.print("\nPilih target (1-4) atau 5 untuk kabur: ");
            int pilihanTarget = input.nextInt();

            if (pilihanTarget == 5) {
                System.out.println("Anda kabur dari arena...");
                break;
            }

            if (pilihanTarget < 1 || pilihanTarget > 4) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Masukkan kekuatan serangan (10-100): ");
            int power = input.nextInt();

            int indeksMonster = pilihanTarget - 1;

            System.out.println("\n>>> ANDA MENYERANG <<<");
            gelombangMonster[indeksMonster].terimaDamage(power);
            if (gelombangMonster[indeksMonster].healthPoint == 0) {
                System.out.println(gelombangMonster[indeksMonster].namaMusuh + " telah dikalahkan!");

                if (gelombangMonster[indeksMonster] instanceof BisaLoot) {
                    BisaLoot monsterLoot = (BisaLoot) gelombangMonster[indeksMonster];
                    monsterLoot.jatuhkanItem();
                }
            }

            System.out.println("\n<<< MONSTER MEMBALAS >>>");

            for (int i = 0; i < gelombangMonster.length; i++) {

                if (gelombangMonster[i].healthPoint > 0) {

                    Musuh2 monsterAktif = gelombangMonster[i];
                    monsterAktif.suaraKhas();

                    if (monsterAktif instanceof BisaTerbang) {
                        System.out.println("[PERINGATAN! SERANGAN UDARA TERDETEKSI]");
                        BisaTerbang monsterTerbang = (BisaTerbang) monsterAktif;
                        monsterTerbang.lepasLandas();
                        monsterTerbang.seranganUdara();
                    } else {
                        monsterAktif.serangPemain();
                    }
                }
            }
        }

        boolean semuaMati = true;
        for (int i = 0; i < gelombangMonster.length; i++) {
            if (gelombangMonster[i].healthPoint > 0) {
                semuaMati = false;
                break;
            }
        }

        if (semuaMati) {
            System.out.println("\nSELAMAT! Anda telah menyapu bersih gelombang monster ini!");
            isBermain = false;
        }

        input.close();
        System.out.println("\nPermainan Berakhir.");
    }
}