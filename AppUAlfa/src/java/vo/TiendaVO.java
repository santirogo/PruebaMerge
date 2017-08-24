package vo;

import java.util.ArrayList;

public class TiendaVO {
    
 private String categoria;
 private String nombre;
 private VendedorVO vendedor;
 private ArrayList<ProductoVO> producto;
 private double puntuacion;
 

    public TiendaVO() {
        this.producto= new ArrayList<ProductoVO>();
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public VendedorVO getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorVO vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ProductoVO> getProducto() {
        return producto;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    
 
 
 
 
 
 
}
