/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vo.UsuarioVO;

/**
 *
 * @author Diego Alvarez <diesazul96@hotmail.com>
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertar method, of class UsuarioDAO.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        UsuarioVO user = new UsuarioVO();
        UsuarioDAO instance = new UsuarioDAO();
        
        user.setCorreo("andressa.romero@correo.usa.edu.co");
        user.setNombre("Santiago Romero");
        user.setPassword("12345");
        user.setCelular("1256789");
        user.setPuntuacion(5);
        
        boolean expResult = false;
        boolean result = instance.insertar(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of editar method, of class UsuarioDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        UsuarioVO user = new UsuarioVO();
        UsuarioDAO instance = new UsuarioDAO();
        
        user.setCorreo("andressa.romero@correo.usa.edu.co");
        user.setNombre("Andres Romero");
        user.setPassword("12345");
        user.setCelular("1256789");
        user.setPuntuacion(5);
        
        boolean expResult = true;
        boolean result = instance.editar(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of borrar method, of class UsuarioDAO.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        UsuarioVO user = new UsuarioVO();
        UsuarioDAO instance = new UsuarioDAO();
        
        user.setCorreo("andressa.romero@correo.usa.edu.co");
        user.setNombre("Andres Romero");
        user.setPassword("12345");
        user.setCelular("1256789");
        user.setPuntuacion(5);
        
        boolean expResult = false;
        boolean result = instance.borrar(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of loggear method, of class UsuarioDAO.
     */
    @Test
    public void testLoggear() {
        System.out.println("loggear");
        UsuarioVO user = new UsuarioVO();
        UsuarioDAO instance = new UsuarioDAO();
        
        user.setCorreo("andressa.romero@correo.usa.edu.co");
        user.setPassword("12345");
        
        boolean expResult = true;
        boolean result = instance.loggear(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
