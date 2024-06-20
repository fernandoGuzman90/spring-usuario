/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mh.gob.sv.demo1.repository;

import com.mh.gob.sv.demo1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernando.guzman
 */
@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Long>{
    
}
