/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class DetalleTest {
    
    public DetalleTest() {
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
     * Test of getId method, of class Detalle.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Detalle instance = new Detalle();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Detalle.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Detalle instance = new Detalle();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_pro method, of class Detalle.
     */
    @Test
    public void testGetId_pro() {
        System.out.println("getId_pro");
        Detalle instance = new Detalle();
        int expResult = 0;
        int result = instance.getId_pro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_pro method, of class Detalle.
     */
    @Test
    public void testSetId_pro() {
        System.out.println("setId_pro");
        int id_pro = 0;
        Detalle instance = new Detalle();
        instance.setId_pro(id_pro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Detalle.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Detalle instance = new Detalle();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Detalle.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Detalle instance = new Detalle();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Detalle.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Detalle instance = new Detalle();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Detalle.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Detalle instance = new Detalle();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_venta method, of class Detalle.
     */
    @Test
    public void testGetId_venta() {
        System.out.println("getId_venta");
        Detalle instance = new Detalle();
        int expResult = 0;
        int result = instance.getId_venta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_venta method, of class Detalle.
     */
    @Test
    public void testSetId_venta() {
        System.out.println("setId_venta");
        int id_venta = 0;
        Detalle instance = new Detalle();
        instance.setId_venta(id_venta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
