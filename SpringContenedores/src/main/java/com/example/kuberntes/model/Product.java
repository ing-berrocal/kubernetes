package com.example.kuberntes.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "tbl_product")
@Entity
@NamedQueries({
        @NamedQuery(name = Product.FINDALL,query = "SELECT p FROM Product p ORDER BY p.codigo"),
        @NamedQuery(name = Product.FINDNAME,query = "SELECT p FROM Product p WHERE p.nombre = :nombre")
})
public class Product implements Serializable {

    public static final String FINDALL = "ProductoEntity_findAll";
    public static final String FINDNAME = "ProductoEntity_findName";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column
    private String categoria;
    @Column
    private String codigo;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column(name = "uuid_imagen")
    private String urlImagen;
    @Column(name = "valor_venta")
    private BigDecimal valor;
    @Column(name = "es_activo")
    private Boolean esActivo;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public Boolean getEsActivo() {
        return esActivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}