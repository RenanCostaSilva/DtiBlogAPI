package br.com.renancsdev.dti_api_rest.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "Postagem")
data class Postagem(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    val id: Long,

    @Column(name = "Titulo")
    val title: String ,

    @Column(name = "Texto")
    val postText: String ,

    @Column(name = "Data")
    val dateCreationPost: Date

)
