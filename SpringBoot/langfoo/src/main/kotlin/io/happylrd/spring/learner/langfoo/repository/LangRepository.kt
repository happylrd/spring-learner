package io.happylrd.spring.learner.langfoo.repository

import io.happylrd.spring.learner.langfoo.domain.Lang
import org.springframework.data.repository.CrudRepository

interface LangRepository : CrudRepository<Lang, Long> {
    fun findById(id: Long): Lang

    fun findByName(name: String): List<Lang>
}