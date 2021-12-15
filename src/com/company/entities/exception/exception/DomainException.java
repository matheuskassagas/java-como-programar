package com.company.entities.exception.exception;

//extends RunTimeException - nao obriga a fazer tratacao
//extends Exception - obriga a trata
public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;

    //Permitindo que eu faça uma instancia da minha classe passando uma mensagem pra ela
    public DomainException (String msg){
        //passando a mensagem para o construtor da superClass
        super(msg);
    }
}
