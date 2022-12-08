package abstractInsuranceFactory.factory;

import abstractInsuranceFactory.AracTipi;
import abstractInsuranceFactory.Surucu;
import abstractInsuranceFactory.araclar.ticari.Ticari;
import abstractInsuranceFactory.araclar.ticari.TicariSurucu;

public class TicariFactory extends Factory{
    @Override
    public AracTipi aracOlustur() {
        return new Ticari();
    }

    @Override
    public Surucu surucuOlustur() {
        return new TicariSurucu();
}
}
