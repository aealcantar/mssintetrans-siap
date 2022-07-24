
package mx.gob.imss.consultamatricula;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.imss.consultamatricula package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.imss.consultamatricula
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaMatriculaResponse }
     * 
     */
    public ConsultaMatriculaResponse createConsultaMatriculaResponse() {
        return new ConsultaMatriculaResponse();
    }

    /**
     * Create an instance of {@link ConsultaMatriculaResponse.ConsultaMatriculaResult }
     * 
     */
    public ConsultaMatriculaResponse.ConsultaMatriculaResult createConsultaMatriculaResponseConsultaMatriculaResult() {
        return new ConsultaMatriculaResponse.ConsultaMatriculaResult();
    }

    /**
     * Create an instance of {@link ConsultaMatricula }
     * 
     */
    public ConsultaMatricula createConsultaMatricula() {
        return new ConsultaMatricula();
    }

}
