
package user;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "User", targetNamespace = "http://test.nigel.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface User {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "getNameReturn", targetNamespace = "http://test.nigel.com")
    @RequestWrapper(localName = "getName", targetNamespace = "http://test.nigel.com", className = "user.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://test.nigel.com", className = "user.GetNameResponse")
    public String getName();

    /**
     * 
     * @param name
     */
    @WebMethod
    @RequestWrapper(localName = "setName", targetNamespace = "http://test.nigel.com", className = "user.SetName")
    @ResponseWrapper(localName = "setNameResponse", targetNamespace = "http://test.nigel.com", className = "user.SetNameResponse")
    public void setName(
        @WebParam(name = "name", targetNamespace = "http://test.nigel.com")
        String name);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "welcomeReturn", targetNamespace = "http://test.nigel.com")
    @RequestWrapper(localName = "welcome", targetNamespace = "http://test.nigel.com", className = "user.Welcome")
    @ResponseWrapper(localName = "welcomeResponse", targetNamespace = "http://test.nigel.com", className = "user.WelcomeResponse")
    public String welcome();

}
