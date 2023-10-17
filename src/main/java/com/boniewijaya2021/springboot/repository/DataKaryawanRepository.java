package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.TblKaryawan;
import org.springframework.data.repository.CrudRepository;

public interface DataKaryawanRepository extends CrudRepository<TblKaryawan, Long> {
}
