package no.regnskap.domain.kodeverk;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "KATEGORI_T")
public class Kategori {

    public Kategori() {

    }

    public Kategori(String navn, Date opprettet, String opprettetAv) {
        setNavn(navn);
        setOpprettet(opprettet);
        setOpprettetAv(opprettetAv);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "KATEGORI_ID", nullable = false)
    private long kategoriId;

    @Column(name = "NAVN", nullable = false)
    private String navn;

    @Temporal(TemporalType.DATE)
    @Column(name = "OPPRETTET", nullable = false)
    private Date opprettet;

    @Column(name = "OPPRETTET_AV", nullable = false)
    private String opprettetAv;

    public long getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(long kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
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
