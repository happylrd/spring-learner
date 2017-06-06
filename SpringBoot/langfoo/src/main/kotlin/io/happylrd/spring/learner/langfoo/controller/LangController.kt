package io.happylrd.spring.learner.langfoo.controller

import io.happylrd.spring.learner.langfoo.repository.LangRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class LangController(val repository: LangRepository) {

    @GetMapping("/")
    fun listLang() = repository.findAll()

    @GetMapping("/id/{id}")
    fun getLangById(@PathVariable id: Long) = repository.findById(id)

    @GetMapping("/name/{name}")
    fun getLangByName(@PathVariable name: String) = repository.findByName(name)
}
