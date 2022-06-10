package me.msvasilets.reactiveweb.service;

import me.msvasilets.reactiveweb.domain.Resume;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ResumeService {

    Mono<Resume> findById(String resumeId);

    Mono<Resume> saveNew(Resume resume);

    Flux<Resume> findAllBySkillsContains(List<String> requiredSkills);

    Mono<Void> removeById(String resumeId);

}
