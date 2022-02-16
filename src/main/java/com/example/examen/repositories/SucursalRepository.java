package com.example.examen.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.examen.services.SucursalService;

@Repository
public interface SucursalRepository extends CrudRepository<SucursalService,Long> {
}
