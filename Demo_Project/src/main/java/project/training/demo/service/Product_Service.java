package project.training.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import project.training.demo.dto.Product_Response;
import project.training.demo.entity.Product;
import project.training.demo.repo.Product_Repository;

@Service
@RequiredArgsConstructor
public class Product_Service {
	
	private final Product_Repository product_Repository;
	
	public void createProduct(Product product)
	{
		System.out.println("Insert working");
		product_Repository.save(product);
	}
	
	public Product getSingle(Integer id)
	{
		return product_Repository.getById(id);
	}
	
	public List<Product> displayAll()
	{
		return product_Repository.findAll();
	}
	
	public void removeProduct(int pid)
	{
		product_Repository.deleteById(pid);
	}
	
	public void productUpdating(Product product)
	{
		System.out.println("Updating");
		product_Repository.save(product);
	}
	
	public boolean productChecking(int pid)
	{
		return product_Repository.existsById(pid);
	}
	
	public Product_Response getSingleProduct(int pid)
	{
		Product prod = product_Repository.getById(pid);
		
		Product_Response product_Response = convertToDTO(prod);
		
		return product_Response;
	}
	
	private Product_Response convertToDTO(Product product)
	{
		Product_Response product_Response = Product_Response.builder()
											.pid(product.getPid())
											.pname(product.getPname())
											.desp(product.getDesp())
											.details(product.getDetails())
											.category(product.getCategory())
											.maxLocations(product.getMaxLocations())
											.feature(product.getFeature())
											.build();
		return product_Response;
	}
	

}
