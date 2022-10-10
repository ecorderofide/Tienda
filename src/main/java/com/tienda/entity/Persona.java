/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ecord
 */
@Entity
@Table (name="personas")
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    
    @ManyToOne
    @JoinColumn(name="paises_id")
    private Pais pais;
    
    
}
