package mx.gob.imss.service.impl;

import lombok.extern.slf4j.Slf4j;
import mx.gob.imss.components.ConsultaMatriculaCliente;
import mx.gob.imss.consultamatricula.ConsultaMatriculaResponse;
import mx.gob.imss.service.ConsultaMatriculaService;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@Slf4j
@Service
public class ConsultaMatriculaServiceImpl implements ConsultaMatriculaService {

    @Autowired
    private ConsultaMatriculaCliente consultaMatriculaCliente;

    @Autowired
    private MessageSource messageSource;

    public String consultaMatricula(String matricula) {

        ConsultaMatriculaResponse.ConsultaMatriculaResult result = consultaMatriculaCliente.consultaNss(matricula);

        return jaxbObjectToJSON(result);

    }

    private String jaxbObjectToJSON(ConsultaMatriculaResponse.ConsultaMatriculaResult ret) {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(ConsultaMatriculaResponse.ConsultaMatriculaResult.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(ret, sw);

            org.json.JSONObject json = XML.toJSONObject(sw.toString());

            return json.toString(4);

        } catch (JAXBException e) {

            e.printStackTrace();

            return e.toString();

        }

    }


}
