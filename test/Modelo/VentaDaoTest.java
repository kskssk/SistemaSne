/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class VentaDaoTest {
    
    public VentaDaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of IdVenta method, of class VentaDao.
     */
    @Test
    public void testIdVenta() {
        System.out.println("IdVenta");
        VentaDao instance = new VentaDao();
        int expResult = 0;
        int result = instance.IdVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegistrarVenta method, of class VentaDao.
     */
    @Test
    public void testRegistrarVenta() {
        System.out.println("RegistrarVenta");
        Venta v = null;
        VentaDao instance = new VentaDao();
        int expResult = 0;
        int result = instance.RegistrarVenta(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegistrarDetalle method, of class VentaDao.
     */
    @Test
    public void testRegistrarDetalle() {
        System.out.println("RegistrarDetalle");
        Detalle Dv = null;
        VentaDao instance = new VentaDao();
        int expResult = 0;
        int result = instance.RegistrarDetalle(Dv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarStock method, of class VentaDao.
     */
    @Test
    public void testActualizarStock() {
        System.out.println("ActualizarStock");
        int cant = 0;
        int id = 0;
        VentaDao instance = new VentaDao();
        boolean expResult = false;
        boolean result = instance.ActualizarStock(cant, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listarventas method, of class VentaDao.
     */
    @Test
    public void testListarventas() {
        System.out.println("Listarventas");
        VentaDao instance = new VentaDao();
        List expResult = null;
        List result = instance.Listarventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarVenta method, of class VentaDao.
     */
    @Test
    public void testBuscarVenta() {
        System.out.println("BuscarVenta");
        int id = 0;
        VentaDao instance = new VentaDao();
        Venta expResult = null;
        Venta result = instance.BuscarVenta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pdfV method, of class VentaDao.
     */
    @Test
    public void testPdfV() {
        System.out.println("pdfV");
        int idventa = 0;
        int Cliente = 0;
        double total = 0.0;
        String usuario = "";
        VentaDao instance = new VentaDao();
        instance.pdfV(idventa, Cliente, total, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
