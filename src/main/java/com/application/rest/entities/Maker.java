package com.application.rest.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity // indicamos que es una entidad JPA
@Table(name = "fabricante") // indicamos que el noombre de la talla es fabricante
public class Maker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indicamos que es la clave primaria y se generará
                                                        // automáticamente
    private Long id;
    @Column(name = "name") // indicamos que el nombre de la columna es name
    private String name;

    @OneToMany(mappedBy = "maker", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Product> products = new ArrayList<>(); // Relación con la entidad Product, si es necesario

}
