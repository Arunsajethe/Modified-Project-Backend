package project.training.productcatalog.bundle.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import project.training.productcatalog.bundle.entity.Bundle;
import project.training.productcatalog.bundle.service.BundleService;

@RestController
@RequestMapping("/bundle")
@CrossOrigin("http://localhost:4200/")
@RequiredArgsConstructor
public class BundleController {
	
	private final BundleService bundleService;
	
	@PostMapping("/insert")
	public Bundle createBundle(@RequestBody Bundle bundle)
	{
		bundleService.insertData(bundle);
		return null;
	}
	
	@GetMapping("/check/{bundle_id}")
	public Bundle idValidation(@PathVariable ("bundle_id") String bundle_id)
	{
		System.out.println(bundle_id);
		return bundleService.checkId(bundle_id);
	}
	
	@GetMapping("/display")
	public List<Bundle> getAll()
	{
		return bundleService.displayAll();
	}

}
