package controlador;

import dao.TiendaDAO;

public class test {
    
    public static void main(String[] args) {
        
        TiendaDAO t = new TiendaDAO();
        System.out.println(t.NombreTienda(2));
        System.out.println(t.LogoTienda(1));
        
        
    }
    
}
