/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.gob.sv.demo1.service;

import com.mh.gob.sv.demo1.model.Usuario;
import com.mh.gob.sv.demo1.repository.usuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fernando.guzman
 */
@Service
public class UsuarioService {

    @Autowired
    private usuarioRepository usuarioRepository;
    
    public List<Usuario>usuarioList(){
    return usuarioRepository.findAll();
    }
    
    public Optional<Usuario>usuarioById(Long id){
    return usuarioRepository.findById(id);
    }
    
    public Usuario crearUsuario(Usuario usuario){
    return usuarioRepository.save(usuario);
    }

    public Usuario actualizarUsuario(Long id, Usuario detallesUsuario) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setNombre(detallesUsuario.getNombre());
        usuario.setApellido(detallesUsuario.getApellido());
        usuario.setEdad(detallesUsuario.getEdad());
        return usuarioRepository.save(usuario);
    }
    
    public void eliminarUsuario(Long id){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuarioRepository.deleteById(id);
    }
}
