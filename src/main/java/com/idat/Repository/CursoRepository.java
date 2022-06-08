package com.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
