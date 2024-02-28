/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso01.tipo.cambio.api.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsServiceImpl implements JwtUserDetailsService {

    // Método para cargar los detalles del usuario por nombre de usuario
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Lógica para cargar los detalles del usuario desde tu fuente de datos (base de datos, servicio, etc.)
        // Aquí debes devolver una implementación de UserDetails
        // Puedes utilizar la clase org.springframework.security.core.userdetails.User como una opción
        // por ejemplo, return new User(username, password, authorities);
        // Asegúrate de manejar excepciones, como UsernameNotFoundException, si el usuario no se encuentra
        throw new UsernameNotFoundException("Usuario no encontrado con nombre: " + username);
    }
    
    // Puedes agregar más métodos según tus necesidades
}

