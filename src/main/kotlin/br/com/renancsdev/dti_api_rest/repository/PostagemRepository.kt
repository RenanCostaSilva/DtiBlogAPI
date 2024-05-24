package br.com.renancsdev.dti_api_rest.repository

import br.com.renancsdev.dti_api_rest.model.Postagem
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface PostagemRepository : CrudRepository<Postagem, Long> {

    @Query(value = "select p from Postagem p where p.id = :id ") // JPQL
    fun findByID(): Postagem

    @Query(value = "select p from Postagem p") // JPQL
    fun findAllPost(): List<Postagem>

    @Query(value = "select id from Postagem p") // JPQL
    fun findAllId(): List<Long>

}