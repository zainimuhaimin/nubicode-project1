package id.nubicode.projek1.features.motel.repo;

import id.nubicode.projek1.features.motel.model.MotelReqDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotelRepo extends JpaRepository<MotelReqDto, Long> {
}
