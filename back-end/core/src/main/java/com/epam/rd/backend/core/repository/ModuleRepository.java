package com.epam.rd.backend.core.repository;

import com.epam.rd.backend.core.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModuleRepository extends JpaRepository<Module, Long> {
    List<Module> findModulesByProgramId(Long id);
}
