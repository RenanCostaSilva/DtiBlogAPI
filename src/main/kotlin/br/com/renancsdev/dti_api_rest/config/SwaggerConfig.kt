package br.com.renancsdev.dti_api_rest.config

import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SwaggerConfig {

    @Bean
    fun detalheApi() = OpenAPI()
        .info(
            Info()
                .title("DTI - Teste Prático , Desenvolvedor Mobile Android - Swagger OpenAPI")
                .description("API do teste prático usando REST API , com OpenAPi")
                .version("1.0")
                .termsOfService("Termo de uso: Open Source")
                .license(
                    License()
                        .name("Apache 2.0")
                        .url("https://github.com/RenanCostaSilva")
                )
        ).externalDocs(
            ExternalDocumentation()
                .description("Author: Renan Costa e Silva")
                .url("https://github.com/RenanCostaSilva")
        )

}