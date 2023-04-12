package br.com.dailytasks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE, reason = "Conflito de task no mesmo horário")
public class TaskUnavailableException extends RuntimeException{
        }
