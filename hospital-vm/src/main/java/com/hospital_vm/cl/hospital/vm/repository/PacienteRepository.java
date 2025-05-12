package com.hospital_vm.cl.hospital.vm.repository;

import com.hospital_vm.cl.hospital.vm.model.Paciente;

import java.util.List;
import java.util.Queue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



public interface PacienteRepository extends JpaRepository<Paciente, Long>{
 
   @Query("SELECT p FROM paciente p WHERE p.apellido= :apellido")
   List<Paciente> buscarPorApellido(@Param("apellidos") String apellido);

   @Query(value = "SELECT * FROM paciente WHERE correo = ;correo", nativeQuery = true)
   Paciente buscarPorcorreo(@Param("correo") String correo);



}
