package md.medinfo.api;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "prices", schema = "public")
public class CatalogItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "codulmedicamentului")
    private String codulMedicamentului;
    private String denumireacomerciala;
    private String formafarmaceutica;
    private String doza;
    private String volum;
    private String divizarea;
    private String country;
    private String detinatorul;
    private long numardeinregistrare;
    private Timestamp registerdate;
    private String codATC;
    private String denumireainternationala;
    private long termendevalabilitate;
    private long barcode;
    private double priceval;
    private String currency;
    private String dataaprobarii;
    private String modificari;
    private String modificari2;
    private Timestamp updatedate;
    private long codulvamal;

    public String getDoza() {
        return doza;
    }

    public void setDoza(String doza) {
        this.doza = doza;
    }

    public String getVolum() {
        return volum;
    }

    public void setVolum(String volum) {
        this.volum = volum;
    }

    public String getDivizarea() {
        return divizarea;
    }

    public void setDivizarea(String divizarea) {
        this.divizarea = divizarea;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDetinatorul() {
        return detinatorul;
    }

    public void setDetinatorul(String detinatorul) {
        this.detinatorul = detinatorul;
    }

    public long getNumardeinregistrare() {
        return numardeinregistrare;
    }

    public void setNumardeinregistrare(long numardeinregistrare) {
        this.numardeinregistrare = numardeinregistrare;
    }


    public Timestamp getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Timestamp registerdate) {
        this.registerdate = registerdate;
    }

    private double priceMDL;

    public String getDenumireacomerciala() {
        return denumireacomerciala;
    }

    public void setDenumireacomerciala(String denumireacomerciala) {
        this.denumireacomerciala = denumireacomerciala;
    }

    public String getFormafarmaceutica() {
        return formafarmaceutica;
    }

    public void setFormafarmaceutica(String formafarmaceutica) {
        this.formafarmaceutica = formafarmaceutica;
    }

    public String getCodulMedicamentului() {
        return codulMedicamentului;
    }

    public void setCodulMedicamentului(String codulMedicamentului) {
        this.codulMedicamentului = codulMedicamentului;
    }

    public double getPriceMDL() {
        return priceMDL;
    }

    public void setPriceMDL(double priceMDL) {
        this.priceMDL = priceMDL;
    }

    public String getCodATC() {
        return codATC;
    }

    public void setCodATC(String codATC) {
        this.codATC = codATC;
    }

    public String getDenumireainternationala() {
        return denumireainternationala;
    }

    public void setDenumireainternationala(String denumireainternationala) {
        this.denumireainternationala = denumireainternationala;
    }

    public long getTermendevalabilitate() {
        return termendevalabilitate;
    }

    public void setTermendevalabilitate(long termendevalabilitate) {
        this.termendevalabilitate = termendevalabilitate;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public double getPriceval() {
        return priceval;
    }

    public void setPriceval(double priceval) {
        this.priceval = priceval;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDataaprobarii() {
        return dataaprobarii;
    }

    public void setDataaprobarii(String dataprobarii) {
        this.dataaprobarii = dataprobarii;
    }

    public String getModificari() {
        return modificari;
    }

    public void setModificari(String modificari) {
        this.modificari = modificari;
    }

    public String getModificari2() {
        return modificari2;
    }

    public void setModificari2(String modificari2) {
        this.modificari2 = modificari2;
    }

    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    public long getCodulvamal() {
        return codulvamal;
    }

    public void setCodulvamal(long codulvamal) {
        this.codulvamal = codulvamal;
    }
}
