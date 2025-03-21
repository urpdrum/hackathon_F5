package br.com.hackathon.paciente.HistoricoPaciente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface HistoricoPacienteRepository extends JpaRepository<HistoricoPaciente, Long> {
    HistoricoPaciente findByDataEntradaHospital(LocalDateTime id);

}
