package com.devsuperior.bds04.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds04.dto.CityDTO;
import com.devsuperior.bds04.dto.RoleDTO;
import com.devsuperior.bds04.dto.UserDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.entities.Role;
import com.devsuperior.bds04.entities.User;
import com.devsuperior.bds04.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;

	@Transactional(readOnly = true)
	public List<CityDTO> findAll(Pageable pageable) {
		List<City> list= repository.findAll(Sort.by("name"));

		return list.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());

	}
	
	@Transactional
	public CityDTO insert(CityDTO dto) {
		City entity = new City();
		entity.setName(dto.getName());
		
		entity = repository.save(entity);
		
		return new CityDTO(entity);
	}

}
