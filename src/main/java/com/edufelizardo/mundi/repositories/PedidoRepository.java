package com.edufelizardo.mundi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edufelizardo.mundi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	
}
