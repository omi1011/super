package com.supercure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supercure.entity.Catagory;

public interface DaoCatagory extends JpaRepository<Catagory	, Long> {

}
