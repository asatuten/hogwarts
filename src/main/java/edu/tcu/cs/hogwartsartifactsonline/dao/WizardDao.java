package edu.tcu.cs.hogwartsartifactsonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;

import java.util.Map;

public interface WizardDao extends JpaRepository<Wizard, String> {

}
