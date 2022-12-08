package abstractInsuranceFactory.factory;

public class FactoryInsMaker {
    public static Factory getFactory(String factoryAracTipi, String marka, String model, String şanzıman, int i, int i1, int i2, int i3){
        if (factoryAracTipi.equalsIgnoreCase("ağır vasıta")){
            return new AgirVasitaFactory();
        } else if (factoryAracTipi.equalsIgnoreCase("Binek Aaraç")) {
            return new BinekFactory();
        } else if (factoryAracTipi.equalsIgnoreCase("Ticari Araç")) {
            return new TicariFactory();
        }
        else{
            return new AraziFactory();
        }
    }
}
