package com.example.big_projects.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sanphamchitiet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSPCT")
    private Integer idSPCT;

    @Column(name = "idTH")
    private Integer idTH;

    @ManyToOne
    @JoinColumn(name = "idSize")
    private Size idSize;

    @ManyToOne
    @JoinColumn(name = "idmau")
    private Mau idMau;

    @Column(name = "soluong")
    private String soLuong;

    @Column(name = "gia")
    private BigDecimal gia;

    @Column(name = "mota")
    private String mota;

    @Column(name = "hinhanh")
    private String hinhAnh;

    @Column(name = "ngaythem")
    private Date ngayThem;

    @Column(name = "tensp")
    private String tenSP;

}
