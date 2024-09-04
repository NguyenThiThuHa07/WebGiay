package com.example.big_projects.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "thuonghieu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idthuonghieu")
    private Integer idthuonghieu;
    @Column(name = "tenthuonghieu")
    private String tenthuonghieu;
}
