package dev.dornol.logbacklogstash.app.repository

import dev.dornol.logbacklogstash.app.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long> {
}