package mx.gob.imss.components;

import lombok.extern.slf4j.Slf4j;
import mx.gob.imss.consultamatricula.ConsultaMatriculaResponse;
import mx.gob.imss.consultamatricula.WsConsultaSIT;
import mx.gob.imss.consultamatricula.WsConsultaSITSoap;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsultaMatriculaCliente {

    public ConsultaMatriculaResponse.ConsultaMatriculaResult consultaNss(String matricula) {

        WsConsultaSIT wConsultaSIT = new WsConsultaSIT();

        WsConsultaSITSoap wsConsultaSITSoap = wConsultaSIT.getWsConsultaSITSoap();

        return wsConsultaSITSoap.consultaMatricula(matricula, "", "", "");


    }



}
