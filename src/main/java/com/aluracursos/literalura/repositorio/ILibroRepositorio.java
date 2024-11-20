package com.aluracursos.literalura.repositorio;

import com.aluracursos.literalura.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibroRepositorio extends JpaRepository<Libro,Long> {
}
