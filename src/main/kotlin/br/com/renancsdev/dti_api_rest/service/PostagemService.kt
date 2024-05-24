package br.com.renancsdev.dti_api_rest.service

import br.com.renancsdev.dti_api_rest.model.Postagem

interface PostagemService {

    fun create(postagem: Postagem)
    fun deletePostID(id: Long)
    fun getList(): List<Postagem>
    fun getPostagemByID(id: Long): Postagem?
    fun getByID(id: Long): Postagem?
    fun update(id: Long , postagem: Postagem)
    fun getListID(): List<Long>?

}