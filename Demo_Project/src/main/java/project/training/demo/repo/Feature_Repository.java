package project.training.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.training.demo.entity.Feature;

public interface Feature_Repository extends JpaRepository<Feature, Integer> {

}
