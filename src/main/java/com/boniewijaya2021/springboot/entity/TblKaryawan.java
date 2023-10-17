package com.boniewijaya2021.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "tbl_users", schema = "cobain")
@Table(name = "tbl_karyawan", schema = "sample")
public class TblKaryawan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nama", nullable = false)
    private String nama;
    @Column(name = "alamat", nullable = false)
    private String alamat;
    @Column(name = "usia", nullable = false)
    private int usia;
    @Column(name = "gaji", nullable = false)
    private double gaji;
    @Column(name = "masakerja", nullable = false)
    private int masaKerja;


}
//@Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(columnDefinition = "serial")
//  private Long id;
//  private String email;
//  private String password;