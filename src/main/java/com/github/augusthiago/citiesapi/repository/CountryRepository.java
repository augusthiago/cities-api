package com.github.augusthiago.citiesapi.repository;

import com.github.augusthiago.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
