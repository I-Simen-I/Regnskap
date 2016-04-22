package no.regnskap.dao;

import no.regnskap.domain.kodeverk.Kategori;

import java.util.List;

public interface KategoriDao {

    void save(Kategori kategori);

    Kategori findById(long id);

    List<Kategori> findAll();
}
