package abstractInsuranceFactory.factory;

import abstractInsuranceFactory.AracTipi;
import abstractInsuranceFactory.Surucu;

public abstract class Factory {

    public abstract AracTipi aracOlustur();
    public abstract Surucu surucuOlustur();

}
