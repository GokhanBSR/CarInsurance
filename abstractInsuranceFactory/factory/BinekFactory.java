package abstractInsuranceFactory.factory;

import abstractInsuranceFactory.AracTipi;
import abstractInsuranceFactory.Surucu;
import abstractInsuranceFactory.araclar.binek.Binek;
import abstractInsuranceFactory.araclar.binek.BinekSurucu;

public class BinekFactory extends Factory{

    @Override
    public AracTipi aracOlustur() {
        return new Binek();
    }

    @Override
    public Surucu surucuOlustur() {
        return new BinekSurucu() ;
    }
}
