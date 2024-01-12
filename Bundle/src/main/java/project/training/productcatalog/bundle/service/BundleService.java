package project.training.productcatalog.bundle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import project.training.productcatalog.bundle.entity.Bundle;
import project.training.productcatalog.bundle.repo.BundleRepository;

@Service
@RequiredArgsConstructor
public class BundleService {
	
	private final BundleRepository bundleRepository;
	
	public void insertData(Bundle bundle)
	{
		bundleRepository.save(bundle);
	}
	
	public Bundle checkId(String id)
	{
		Bundle bundle = bundleRepository.gettingBundleById(id);
		System.out.println(bundle);
		return bundle;
	}
	
	public List<Bundle> displayAll()
	{
		return bundleRepository.findAll();
	}

}
