package br.com.renancsdev.dti_api_rest.controller

import br.com.renancsdev.dti_api_rest.exception.PostagemNotFoundException
import br.com.renancsdev.dti_api_rest.model.Postagem
import br.com.renancsdev.dti_api_rest.model.RespostaJson
import br.com.renancsdev.dti_api_rest.service.PostagemService
import org.springdoc.api.ErrorMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.DeleteMapping
import java.util.*

@RestController
@RequestMapping("/postagem")
class ControllerPostagem {

    @Autowired // vai injetar a classe quando iniciar
    lateinit var postagemService: PostagemService

    // Get
    @GetMapping("/buscarTodos")
    fun buscarTodosPosts(): ResponseEntity<List<Postagem>> {
        val listaPostagem = this.postagemService.getList()
        val status = if(listaPostagem.isEmpty()) HttpStatus.NOT_FOUND
        else HttpStatus.OK
        return ResponseEntity(listaPostagem , status)
    }

    @GetMapping("/buscarPorID/{id}")
    fun buscarPostByID(@PathVariable id: Long): ResponseEntity<Any> {
        val postagem = this.postagemService.getPostagemByID(id)
        return if(postagem != null )
          return  ResponseEntity(postagem, HttpStatus.OK)
        else
          return  ResponseEntity(throw PostagemNotFoundException("Postagem $id não encontrada !"))
    }

    // Post
    @PostMapping("/criar")
    fun criarPost(@RequestBody postagem: Postagem): ResponseEntity<RespostaJson> {
        postagemService.create(postagem)
        val respostaJson = RespostaJson("ok" , Date())
        return ResponseEntity(respostaJson , HttpStatus.CREATED)
    }

    // delete
    @DeleteMapping("/delete/{id}")
    fun deletarPost(@PathVariable id: Long): ResponseEntity<Unit> {

        val status: HttpStatus
        if(!postagemService.getListID().isNullOrEmpty()){
            if(postagemService.getListID()!!.contains(id)){
              postagemService.deletePostID(id)
              status = HttpStatus.ACCEPTED
            }
            else{
                throw PostagemNotFoundException("Postagem $id não encontrada !")
            }
        }else{
            throw PostagemNotFoundException("Postagem $id não encontrada !")
        }
        return ResponseEntity(Unit, status)
    }

    //update
    @PutMapping("/atualizarPost/{id}")
    fun updatePostagem(@PathVariable id: Long , @RequestBody promocao: Postagem): ResponseEntity<Unit> {
        val status: HttpStatus
        if(!postagemService.getListID().isNullOrEmpty()){
            if(postagemService.getListID()!!.contains(id)){
                postagemService.update(id , promocao)
                status = HttpStatus.ACCEPTED
            }
            else{
                throw PostagemNotFoundException("Postagem $id não encontrada !")
            }
        }else{
            throw PostagemNotFoundException("Postagem $id não encontrada !")
        }
        return ResponseEntity(Unit , status)
    }

}