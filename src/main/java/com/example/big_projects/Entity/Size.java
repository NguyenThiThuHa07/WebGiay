package com.example.big_projects.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "size")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsize")
    private Integer idsize;

    @Column(name = "kichthuoc")
    private String kichthuoc;
}
