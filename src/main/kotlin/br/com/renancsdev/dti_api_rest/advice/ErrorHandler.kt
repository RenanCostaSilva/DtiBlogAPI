package br.com.renancsdev.dti_api_rest.advice

import br.com.renancsdev.dti_api_rest.exception.PostagemNotFoundException
import br.com.renancsdev.dti_api_rest.model.ErrorMessage
import com.fasterxml.jackson.core.JsonParseException
import jakarta.servlet.ServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ErrorHandler {

    @ExceptionHandler(JsonParseException::class)
    fun jsonParseExceptionHandler(servletRequest: ServletRequest, servletRRersponse: HttpServletResponse, exception: Exception): ResponseEntity<ErrorMessage> {
        return ResponseEntity<ErrorMessage>(ErrorMessage("Json Error" , exception.message ?: "Invalid Json"), HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(PostagemNotFoundException::class)
    fun promocaoNotFoundExceptionHandler(servletRequest: ServletRequest, servletRRersponse: HttpServletResponse, exception: Exception): ResponseEntity<ErrorMessage> {
        return ResponseEntity(ErrorMessage("Postagem não localizada", exception.message !!), HttpStatus.NOT_FOUND)
    }
}