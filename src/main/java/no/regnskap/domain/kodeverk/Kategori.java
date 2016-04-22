package no.regnskap.domain.kodeverk;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "KATEGORI_T")
public class Kategori {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "KATEGORI_ID", nullable = false)
    private long kategoriId;

    @Column(name = "NAVN", nullable = false)
    private String navn;

    @Temporal(TemporalType.DATE)
    @Column(name = "OPPRETTET", nullable = false)
    private Date opprettet;

    public long getKategoriType() {
        return kategoriId;
    }

    public void setKategoriType(long kategoriId) {
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
}
