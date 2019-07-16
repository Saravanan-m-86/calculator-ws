/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.home.math;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Balaji Moorthy
 */
@WebService(serviceName = "CalcuatorWS")
public class CalcuatorWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "txt") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "add")
    public Integer add(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        return num1 + num2;
    }
    
    @WebMethod(operationName = "subtract")
    public Integer subtract(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        return num1 - num2;
    }
    
    
}
