package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.RegionRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Region;


@RestController
public class RegionController {


	@Autowired
	private RegionRepository regionRepository;

	@GetMapping("/regions")
	public List<Region> query() {
		return regionRepository.getAllRegions();
	}
	@GetMapping("/region/{id}")
	public List<Region> getRegionById(@PathVariable Long id) {
		return regionRepository.getRegionById(id);
	}
}
