package no.regnskap.pages.kategori;

import java.io.Serializable;

public class KategoriForm implements Serializable {

    private String user;

    private String kategoriNavn;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getKategoriNavn() {
        return kategoriNavn;
    }

    public void setKategoriNavn(String kategoriNavn) {
        this.kategoriNavn = kategoriNavn;
    }
}
