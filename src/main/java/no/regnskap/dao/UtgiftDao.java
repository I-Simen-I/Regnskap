package no.regnskap.dao;

import no.regnskap.domain.Kategori;
import no.regnskap.domain.Utgift;

import java.util.List;

public interface UtgiftDao {

    void save(Utgift utgift);

    Utgift findById(long id);

    List findAll();

    List findUtgifterByKategori(Kategori kategori);

    List findUtgifterByUser(String user);

    List findUtgifterByUserAndKategori();
}
