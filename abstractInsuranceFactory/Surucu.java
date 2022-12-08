package abstractInsuranceFactory;

public abstract class Surucu {

    protected String surucuAdi;
    protected   String surucuSoyadi;
    protected String surucuYasi;

    public Surucu(String surucuAdi, String surucuSoyadi, String surucuYasi) {
        this.surucuAdi = surucuAdi;
        this.surucuSoyadi = surucuSoyadi;
        this.surucuYasi = surucuYasi;
    }

    public String getSurucuAdi() {
        return surucuAdi;
    }

    public String getSurucuSoyadi() {
        return surucuSoyadi;
    }

    public String getSurucuYasi() {
        return surucuYasi;
    }
}
