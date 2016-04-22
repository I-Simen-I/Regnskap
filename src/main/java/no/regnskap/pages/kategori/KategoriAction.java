package no.regnskap.pages.kategori;

import no.regnskap.domain.kodeverk.Kategori;
import no.regnskap.pages.CommonAction;
import no.regnskap.service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.Date;

public class KategoriAction extends CommonAction {
    private KategoriForm form = new KategoriForm();

    @Autowired
    private KategoriService service;

    public void save() {
        Kategori kategori = new Kategori(getForm().getKategoriNavn(), new Date(), getForm().getUser());
        service.save(kategori);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kategorien " + kategori.getNavn() + " er nå opprettet"));
    }

    public void setService(KategoriService service) {
        this.service = service;
    }

    public KategoriForm getForm() {
        return form;
    }
}
