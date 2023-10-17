package com.boniewijaya2021.springboot.service;

import com.boniewijaya2021.springboot.entity.TblKaryawan;
import com.boniewijaya2021.springboot.repository.DataKaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DataKaryawanService {
    private final DataKaryawanRepository repository;

    @Autowired
    public DataKaryawanService(DataKaryawanRepository repository) {
        this.repository = repository;
    }

    public List<TblKaryawan> getAllKaryawan() {
        return (List<TblKaryawan>) repository.findAll();
    }

    public Optional<TblKaryawan> getKaryawanById(Long id) {
        return repository.findById(id);
    }

    public TblKaryawan saveKaryawan(TblKaryawan karyawan) {
        return repository.save(karyawan);
    }

    public void deleteKaryawan(Long id) {
        repository.deleteById(id);
    }
}
