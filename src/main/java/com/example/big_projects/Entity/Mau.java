package com.example.big_projects.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mau")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmau")
    private Integer idmau;
    @Column(name = "tenmau")
    private String tenmau;
}
