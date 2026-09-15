package co.edu.uniandes.labociencia.seguridad;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "http://172.23.66.75:4200" })
public class ProtocoloController {

    private final ProtocoloRepository protocoloRepository;
    private static final Logger log = (Logger) LoggerFactory.getLogger(ProtocoloController.class);

    public ProtocoloController( ProtocoloRepository protocoloRepository){
        this.protocoloRepository = protocoloRepository;

    }

    

    @GetMapping("/protocolos")
    public List<ProtocoloSeguridadDTO> listarProtocolos() {
        return protocoloRepository.findAll();
    }

    @PostMapping("/protocolos")
    @ResponseStatus (HttpStatus.CREATED)
    public ProtocoloSeguridadDTO postMethodName(@RequestBody ProtocoloSeguridadDTO protocolo) {
        log.info("POST /artistas - body recibido: {}", protocolo);
        return protocolo;
    }
    

    
    
}
