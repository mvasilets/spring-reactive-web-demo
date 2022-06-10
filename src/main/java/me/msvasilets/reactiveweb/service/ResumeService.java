package me.msvasilets.reactiveweb.service;

import me.msvasilets.reactiveweb.domain.Resume;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ResumeService {

    Mono<Resume> findById(String resumeId);

    Mono<Resume> saveNew(Mono<Resume> resume);

    Mono<Void> removeById(String resumeId);

}
