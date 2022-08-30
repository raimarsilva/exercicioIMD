package com.example.demoGradle.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
//Anotações lombok
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
// JPA
@Entity
@Table(name = "tb_advogado")
public class Advogado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String registroOAB;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_vinculacao", joinColumns = @JoinColumn(name = "id_advogado",
            referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "id_processo", referencedColumnName = "id"))
//    @JsonManagedReference(value = "JsonManagedReference")
//    @JsonBackReference(value = "JsonBackReference")
    Set<Processo> processos;


}
