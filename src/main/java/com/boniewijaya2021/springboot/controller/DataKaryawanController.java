package com.boniewijaya2021.springboot.controller;

import com.boniewijaya2021.springboot.entity.TblKaryawan;
import com.boniewijaya2021.springboot.service.DataKaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class DataKaryawanController {

    private final DataKaryawanService service;

    @Autowired
    public DataKaryawanController(DataKaryawanService service) {
        this.service = service;
    }

    @GetMapping
    public List<TblKaryawan> getAllKaryawan() {
        return service.getAllKaryawan();
    }

    @GetMapping("/{id}")
    public Optional<TblKaryawan> getKaryawanById(@PathVariable Long id) {
        return service.getKaryawanById(id);
    }

    @PostMapping
    public TblKaryawan createKaryawan(@RequestBody TblKaryawan dataKaryawan) {
        return service.saveKaryawan(dataKaryawan);
    }

    @DeleteMapping("/{id}")
    public void deleteKaryawan(@PathVariable Long id) {
        service.deleteKaryawan(id);
    }
}
