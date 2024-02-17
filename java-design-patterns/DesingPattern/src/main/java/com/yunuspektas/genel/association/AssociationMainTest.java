package com.yunuspektas.genel.association;

public class AssociationMainTest {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("Yunus" , "Pektaş");
        Banka banka = new Banka("xyz bankası" , "İstanbul");

        System.out.println(musteri.getMusterriAdi() + " Association " + banka.getBankaAdi());
//  Association birbirinden bağımsız çalışan varlığına bir etkileri olmayan yapıları ifade eder.
    }
}
