package com.alura.alurafood.repository;

import com.alura.alurafood.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}
