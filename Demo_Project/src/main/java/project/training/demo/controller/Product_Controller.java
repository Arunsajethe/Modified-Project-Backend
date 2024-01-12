package project.training.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import project.training.demo.dto.Product_Response;
import project.training.demo.entity.Product;
import project.training.demo.service.Product_Service;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:4200/")
@RequiredArgsConstructor
public class Product_Controller {
	
	private final Product_Service product_Service;
	
	@PostMapping("/insert")
	public void insertData(@RequestBody Product product)
	{
		System.out.println(product);
		product_Service.createProduct(product);
	}
	
	@GetMapping("/display")
	public List<Product> displayProduct()
	{
		return product_Service.displayAll();
	}
	
	@GetMapping("singleproduct/{pid}")
	public Product_Response getProductByPid(@PathVariable ("pid") int pid)
	{
		return product_Service.getSingleProduct(pid);
	}
	
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestParam int pid)
	{
		System.out.println(pid);
		product_Service.removeProduct(pid);
		return "deleted";
	}
	
	@PutMapping("/editProduct/{pid}")
	public String updatingProduct(@PathVariable int pid,@RequestBody Product product)
	{
		System.out.println(pid);
		System.out.println(product);
		boolean prod = product_Service.productChecking(pid);
		System.out.println("checking");
		if(!prod)
		{
			return "Product not Existing";
		}
		else
		{
			product_Service.productUpdating(product);
			return "updated";
		}
	}
	
	@GetMapping("/displayByBundle/{my_id}")
	public List<Product_Response> getBasedOnBundle(@PathVariable ("my_id") List<Integer> my_id)
	{
		System.out.println("Working");
		System.out.println(my_id);
		List<Product_Response> myProd = new ArrayList<>();
		for (Integer i: my_id)
		{
			Product_Response prod = product_Service.getSingleProduct(i);
			System.out.println(prod);
			myProd.add(prod);
			System.out.println(myProd);
		}
		return myProd;
	}

}
