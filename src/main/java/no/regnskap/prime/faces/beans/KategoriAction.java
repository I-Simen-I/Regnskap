package no.regnskap.prime.faces.beans;

import no.regnskap.domain.kodeverk.Kategori;
import no.regnskap.service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.Date;

public class KategoriAction extends CommonAction {

    private Kategori kategori = new Kategori();

    @Autowired
    private KategoriService service;

    public void save() {
        kategori.setOpprettet(new Date());
        service.save(kategori);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kategorien " + kategori.getNavn() + " er nå opprettet"));
    }

    public void setService(KategoriService service) {
        this.service = service;
    }

    public Kategori getKategori() {
        return kategori;
    }
}
