package br.com.bennytech.relatorioDeVendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bennytech.relatorioDeVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>  {

}
