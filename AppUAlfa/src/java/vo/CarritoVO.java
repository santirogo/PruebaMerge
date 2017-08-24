package vo;

import java.util.ArrayList;

public class CarritoVO {
    private UsuarioVO usuario;
    private ArrayList<ProductoVO> productos;

    public CarritoVO() {
        this.productos = new ArrayList<ProductoVO>();
    }

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }

    public void agregarProducto(ProductoVO producto){
        this.productos.add(producto);
    }
    
    public ArrayList<ProductoVO> getProductos() {
        return productos;
    }
    
}
