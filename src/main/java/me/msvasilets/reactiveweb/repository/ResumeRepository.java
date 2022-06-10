package me.msvasilets.reactiveweb.repository;

import me.msvasilets.reactiveweb.domain.Resume;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.Collection;
import java.util.List;

public interface ResumeRepository extends ReactiveMongoRepository<Resume, String> {

}
