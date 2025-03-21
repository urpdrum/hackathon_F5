package br.com.hackathon.paciente.paciente;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    //  @Autowired
    private final PacienteRepository pacienteRepository;
    //  @Autowired
    // private final HistoricoPacienteRepository historicoPacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    public Paciente salvaPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
        return paciente;
    }

    public List<Paciente> buscaTodosPaciente() {
        List<Paciente> listaPacientes = pacienteRepository.findAll();
        return listaPacientes;
    }

    public Paciente buscaPacientePorCpf(long cpf) {
        return pacienteRepository.findByCpf(cpf);
    }

    public List<HistoricoPaciente> historicoPaciente(long cpf) {
        Paciente paciente = pacienteRepository.findByCpf(cpf);
        return pacienteRepository.findByCpf(cpf).pegaHistoricoPaciente();
    }
}
