package br.com.renancsdev.dti_api_rest.service.impl

import br.com.renancsdev.dti_api_rest.model.Postagem
import br.com.renancsdev.dti_api_rest.repository.PostagemRepository
import br.com.renancsdev.dti_api_rest.service.PostagemService
import org.springframework.stereotype.Component

@Component
class PostagemImpl(val postagemRepository: PostagemRepository ): PostagemService {

    override fun create(postagem: Postagem) {
       this.postagemRepository.save(postagem)
    }

    override fun deletePostID(id: Long) {
        return this.postagemRepository.deleteById(id)
    }

    override fun getList(): List<Postagem> {
        return this.postagemRepository.findAll().toList()
    }

    override fun getPostagemByID(id: Long): Postagem? {
        return this.postagemRepository.findById(id).orElseGet(null)
    }

    override fun getByID(id: Long): Postagem? {
        return this.postagemRepository.findById(id).orElseGet(null)
    }

    override fun update(id: Long, postagem: Postagem) {
        create(postagem)
    }

    override fun getListID(): List<Long>? {
        return this.postagemRepository.findAllId()
    }

}