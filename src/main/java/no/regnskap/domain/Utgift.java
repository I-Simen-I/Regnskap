package no.regnskap.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UTGIFT")
public class Utgift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UTGIFT_ID", nullable = false)
    private long utgiftId;

    @Column(name = "MAANED", nullable = false)
    private String maaned;

    @ManyToOne
    @JoinColumn(name = "KATEGORI_T", nullable = false)
    private Kategori kategoriType;

    @Column(name = "BELOP", nullable = false)
    private double belop;

    @Column(name = "BESKRIVELSE")
    private String beskrivelse;

    @Column(name = "OPPRETTET", nullable = false)

    private Date opprettet;

    @Column(name = "OPPRETTET_AV", nullable = false)
    private String opprettetAv;

    public long getUtgiftId() {
        return utgiftId;
    }

    public void setUtgiftId(long utgiftId) {
        this.utgiftId = utgiftId;
    }

    public String getMaaned() {
        return maaned;
    }

    public void setMaaned(String maaned) {
        this.maaned = maaned;
    }

    public Kategori getKategoriType() {
        return kategoriType;
    }

    public void setKategoriType(Kategori kategoriType) {
        this.kategoriType = kategoriType;
    }

    public double getBelop() {
        return belop;
    }

    public void setBelop(double belop) {
        this.belop = belop;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public Date getOpprettet() {
        return opprettet;
    }

    public void setOpprettet(Date opprettet) {
        this.opprettet = opprettet;
    }

    public String getOpprettetAv() {
        return opprettetAv;
    }

    public void setOpprettetAv(String opprettetAv) {
        this.opprettetAv = opprettetAv;
    }
}
