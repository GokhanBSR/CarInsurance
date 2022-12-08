package abstractInsuranceFactory.factory;

import abstractInsuranceFactory.AracTipi;
import abstractInsuranceFactory.Surucu;
import abstractInsuranceFactory.araclar.arazi.AraziAraci;
import abstractInsuranceFactory.araclar.arazi.AraziSurucu;

public class AraziFactory extends Factory{
    @Override
    public AracTipi aracOlustur() {
        return new AraziAraci();
    }

    @Override
    public Surucu surucuOlustur() {
        return new AraziSurucu();
    }
}
