package com.ujjwal.repository;

import com.ujjwal.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author ujjwal
 *
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
}
