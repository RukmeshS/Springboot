package com.ty.boot_emp.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.boot_emp.dto.Empl;

public interface Repos extends JpaRepository<Empl, Integer> {

}
