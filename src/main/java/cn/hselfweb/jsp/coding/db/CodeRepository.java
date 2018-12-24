package cn.hselfweb.jsp.coding.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CodeRepository extends JpaRepository<Code,Long> {

    Code getByCodeId(Long codeId);

    Code save(Code code);

    List<Code> getAllByUserId(Long userId);
}
