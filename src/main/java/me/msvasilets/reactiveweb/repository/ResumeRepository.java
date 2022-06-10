package me.msvasilets.reactiveweb.repository;

import me.msvasilets.reactiveweb.domain.Resume;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ResumeRepository extends ReactiveMongoRepository<Resume, String> {
}
