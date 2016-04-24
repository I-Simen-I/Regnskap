package no.regnskap.pages.kategori;

import no.regnskap.domain.kodeverk.Kategori;
import no.regnskap.pages.CommonAction;
import no.regnskap.service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KategoriAction extends CommonAction {
    private KategoriForm form = new KategoriForm();

    private List<Kategori> kategoriList;

    @Autowired
    private KategoriService service;

    @Override
    public void onload() {
        kategoriList = service.findAll();
    }

    public void save() {
        Kategori kategori = new Kategori(getForm().getKategoriNavn(), new Date(), getUser());
        service.save(kategori);
        form.setKategoriNavn(null);
        kategoriList = service.findAll();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kategorien " + kategori.getNavn() + " er nå opprettet"));
    }

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for (Kategori kategori : getKategoriList()) {
            if (kategori.getNavn().toLowerCase().startsWith(query.toLowerCase())) {
                results.add(kategori.getNavn());
            }
        }

        return results;
    }

    public KategoriForm getForm() {
        return form;
    }

    public List<Kategori> getKategoriList() {
        return kategoriList;
    }

    public void setService(KategoriService service) {
        this.service = service;
    }
}
