package abstractInsuranceFactory;

import abstractInsuranceFactory.factory.Factory;
import abstractInsuranceFactory.factory.FactoryInsMaker;

/**
 * @author gbasara
 * since 1.0.1
 */
public class InsuranceMain {
    public static void main(String[] args) {
        Factory binek = FactoryInsMaker.getFactory("Binek Araç","Marka","Model","Şanzıman", 1600,2022,1,500000);
        Factory ticari = FactoryInsMaker.getFactory("Ticari","Marka","Model","Şanzıman",2000,2022,2,450000);
        Factory araziArac = FactoryInsMaker.getFactory("Arazi","Marka","Model","Otamatik",4000,2022,3,1000000);
        Factory agirVasita = FactoryInsMaker.getFactory("Ağır Vasıta","Marka","Model","Düz", 6000,2022,4,3000000);


        System.out.println("Binek Araç");
        System.out.println(binek);

        System.out.println("Ticari Araç");
        System.out.println(ticari);

        System.out.println("Arazi Aracı");
        System.out.println(araziArac);

        System.out.println("Ağır Vasıta");
        System.out.println(agirVasita);
    }
}