package testbe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import testbe.enttity.Tb1;

public interface Tb1Repo extends JpaRepository<Tb1, String> {
}
