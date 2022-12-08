package abstractInsuranceFactory;

public abstract class AracTipi {
    protected String aracTipi;
    private String marka;
    private String model;
    private String sanziman;
    private double motorHacmi;
    private int uretimYili;
    private int aracNo;
    private int fiyat;

    public AracTipi(String aracTipi, String marka, String model, String sanziman,
                    double motorHacmi, int uretimYili, int aracNo, int fiyat) {
        this.aracTipi = aracTipi;
        this.marka = marka;
        this.model = model;
        this.sanziman = sanziman;
        this.motorHacmi = motorHacmi;
        this.uretimYili = uretimYili;
        this.aracNo = aracNo;
        this.fiyat = fiyat;
    }

    public String getAracTipi() {
        return aracTipi;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getSanziman() {
        return sanziman;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public int getAracNo() {
        return aracNo;
    }

    public int getFiyat() {
        return fiyat;
    }
}
