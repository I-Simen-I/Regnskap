package no.regnskap.service;

import no.regnskap.domain.Kategori;

import java.util.List;

public interface KategoriService {

    void save(Kategori kategori);

    Kategori findById(long id);

    List<Kategori> findAll();
}
