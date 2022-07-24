package mx.gob.imss.controllers;

import lombok.extern.slf4j.Slf4j;
import mx.gob.imss.service.ConsultaMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/matricula/api")
public class ConsultaMatriculaController {

    @Autowired
    ConsultaMatriculaService consultaMatriculaService;

    @CrossOrigin
    @GetMapping(value = "/consultamatricula/{matricula}", produces = "application/json")
    public ResponseEntity<String> consultaMatricula(@PathVariable(value = "matricula") String matricula) {

        return new ResponseEntity<>(consultaMatriculaService.consultaMatricula(matricula), HttpStatus.OK);

    }

}
