package me.msvasilets.reactiveweb.service.impl;

import lombok.RequiredArgsConstructor;
import me.msvasilets.reactiveweb.domain.Resume;
import me.msvasilets.reactiveweb.repository.ResumeRepository;
import me.msvasilets.reactiveweb.service.ResumeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SimpleResumeService implements ResumeService {

    private final ResumeRepository repository;

    @Override
    public Mono<Resume> findById(String resumeId) {
        return repository.findById(resumeId);
    }

    @Override
    public Mono<Resume> saveNew(Resume resume) {
        return repository.save(resume);
    }

    @Override
    public Flux<Resume> findAllBySkillsContains(List<String> requiredSkills) {
        return repository.findAllBySkillsContaining(requiredSkills);
    }

    @Override
    public Mono<Void> removeById(String resumeId) {
        return repository.deleteById(resumeId);
    }
}
