package no.regnskap.service.impl;

import no.regnskap.dao.KategoriDao;
import no.regnskap.domain.Kategori;
import no.regnskap.service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("kategoriService")
public class KatagoriServiceImpl implements KategoriService {

    @Autowired
    private KategoriDao kategoriDao;

    @Override
    public void save(Kategori kategori) {
        kategoriDao.save(kategori);
    }

    @Override
    public Kategori findById(long id) {
        return kategoriDao.findById(id);
    }

    @Override
    public List<Kategori> findAll() {
        return kategoriDao.findAll();
    }

    public void setKategoriDao(KategoriDao kategoriDao) {
        this.kategoriDao = kategoriDao;
    }
}
