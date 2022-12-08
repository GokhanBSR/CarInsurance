package abstractInsuranceFactory.factory;

import abstractInsuranceFactory.AracTipi;
import abstractInsuranceFactory.Surucu;
import abstractInsuranceFactory.araclar.agirVasita.AgirVasita;
import abstractInsuranceFactory.araclar.agirVasita.AgirVasitaSurucu;

public class AgirVasitaFactory extends Factory{
    @Override
    public AracTipi aracOlustur() {
        return new AgirVasita();
    }

    @Override
    public Surucu surucuOlustur() {
        return new AgirVasitaSurucu();
    }
}
