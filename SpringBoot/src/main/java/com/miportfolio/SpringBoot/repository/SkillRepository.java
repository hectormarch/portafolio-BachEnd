
package com.miportfolio.SpringBoot.repository;

import com.miportfolio.SpringBoot.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    
}
