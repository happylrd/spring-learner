package io.happylrd.spring.learner.langfoo

import io.happylrd.spring.learner.langfoo.domain.Lang
import io.happylrd.spring.learner.langfoo.repository.LangRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class LangFooApplication {

    @Bean
    fun init(repository: LangRepository) = CommandLineRunner {
        // just save some mock data
        repository.save(Lang("Kotlin"))
        repository.save(Lang("Swift"))
        repository.save(Lang("JavaScript"))
        repository.save(Lang("Python"))
        repository.save(Lang("Java"))
        repository.save(Lang("C#"))
        repository.save(Lang("Cpp"))
        repository.save(Lang("C"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(LangFooApplication::class.java, *args)
}
