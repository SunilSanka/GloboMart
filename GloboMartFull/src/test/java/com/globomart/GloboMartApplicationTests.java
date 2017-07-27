package com.globomart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.globomart.model.Product;
import com.globomart.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GloboMartApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
		
	@Test
	@Transactional
	public void testJpaFind() {
		Product prod = new Product();
		
	productRepository.saveAndFlush(prod);
	List<Product> prodList=	productRepository.findAll();
	assertNotNull(prodList);
	}

	@Test
	@Transactional
	public void testJpaFindOne() {
		Product prod = new Product();
		prod.setName("TestProd");
		
		productRepository.saveAndFlush(prod);
	//	List<Product> products =  productRepository.findByPtypeNot("Vehicle");
	//assertNotNull(products);
	//assertNotSame("Vehicle", products.get(0).getPtype());
	entityManager.clear();
	productRepository.delete(prod);
	}
	
	@Test
	@Transactional
	public void saveProduct(){
		Product prod = new Product();
		prod.setName("TestProd");
		
		productRepository.saveAndFlush(prod);
		
		entityManager.clear();
		
		Product product = productRepository.findOne(prod.getId());
		
		assertEquals("TestProd", product.getName());
		//assertEquals("TestType", product.getPtype());
		//assertEquals("12345", product.getCode());
		productRepository.delete(prod);
		
	}
	
	
	@Test
	public void testFindWithLike(){
		Product prod1 = new Product();
		prod1.setName("TestProd1");
		//prod1.setPtype("Electronics");
		//prod1.setCode("12345");
		
		Product prod2 = new Product();
		prod2.setName("TestProd1");
		//prod2.setPtype("Electronics");
		//prod2.setCode("54321");
		
		
		productRepository.saveAndFlush(prod1);
		productRepository.saveAndFlush(prod2);
		
		
	//	List<Product> prodList = productRepository.findByPtypeIgnoreCaseStartingWith("Ele");
	//	assertEquals(2,prodList.size());
		
		entityManager.clear();
		productRepository.delete(prod1);
		productRepository.delete(prod2);
	}
	
}
