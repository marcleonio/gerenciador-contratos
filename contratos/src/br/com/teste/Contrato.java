package br.com.teste;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.config.Conexao;

public class Contrato {
	
	public Contrato(){
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	 
    @Test
    public void testAddition2() throws Exception {
    	Conexao con = new Conexao();
    	assertNotNull("Conexao valida", con.conectar());
	}
}
