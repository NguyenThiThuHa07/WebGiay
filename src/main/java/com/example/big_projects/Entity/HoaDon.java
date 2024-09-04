package com.example.big_projects.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "hoadDon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHD")
    private Integer idhd;

    @ManyToOne
    @JoinColumn(name = "idNguoiDung")
    private NguoiDung idnguoidung;

    @Column(name = "ngaylap")
    private Date ngaylap;

    @Column (name = "tongTien")
    private BigDecimal tongtien;

    @Column (name = " ")
    private String trangthai;

    @ManyToOne
    @JoinColumn(name = "idKhuyenMai")
    private KhuyenMai khuyenmai;

    @ManyToOne
    @JoinColumn(name = "idVoucher")
    private Voucher voucher;

}
