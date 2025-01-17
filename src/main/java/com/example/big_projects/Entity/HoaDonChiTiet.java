package com.example.big_projects.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "hoadonchitiet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idHD")
    private HoaDon idHD;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "gia")
    private BigDecimal gia;

    @ManyToOne
    @JoinColumn(name = "idSPCT")
    private SanPhamChiTiet idSpct;
}
