package br.com.hackathon.paciente.Hospital;


import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerHandler {      
	
	@ExceptionHandler(ChangeSetPersister.NotFoundException.class)
	public ResponseEntity<String> handleNotFound(final ChangeSetPersister.NotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	} 
}
